(ns faceclone.core
  (:require
   [reagent.core :as r]
   [re-frame.core :as rf]
   [secretary.core :as secretary]
   [garden.core :as garden]
   [goog.events :as events]
   [goog.history.EventType :as HistoryEventType]
   [markdown.core :refer [md->html]]
   [ajax.core :refer [GET POST]]
   [faceclone.ajax :refer [load-interceptors!]]
   [faceclone.handlers]
   [faceclone.subscriptions]
   [faceclone.pages.home :as home]
   [faceclone.pages.timeline :refer [timeline-page]])
  (:import goog.History))

; ---------------------------------------------------------------------------
; Styles
; ---------------------------------------------------------------------------

;;; Logged-out Navbar
(def logged-out-styles
  [[:.navbar-default
    {:background-color "#3b5998"
     :color "#fff"
     :padding-bottom "15px"}]
   [:.navbar-default
    [:.navbar-brand
     {:font-size "inherit"
      :color "#fff"}]]])

(def styles
  [[:body {:padding-top "50px"
           :padding-bottom "20px"}]

   [:.navbar-default
    {:background-color "#3b5998"
     :color "#fff"}
    [:.navbar-brand
     {:font-size "36px"
      :height "auto"
      :color "#fff"}
     [:img {:height "25px"}]]
    [:.navbar-nav
     [:li
      [:a {:color "#fff"
           :font-size "20px"}]]]]

   [:.jumbotron
    {:height "520px !important"
     :padding "48px 0"
     :background-image "linear-gradient(rgba(30, 30, 30, 0.5), rgba(30, 30, 30, 0.5)), url(https://s3.amazonaws.com/viking_education/web_development/web_app_eng/hogwarts_small.jpg)"
     :background-position "center"
     :background-attachment "fixed"}]

   [:.dp
    {:position "absolute"
     :top "6rem"
     :margin-top "27em"}]

   [:.dp-img
    {:width "156px"
     :max-height "200px"}]

   [:.dp-profile-name
    {:color "#fff"
     :text-decoration "none"
     :font-size "2.3em"
     :margin-left "1.7rem"}]

   [:.timeline-nav
    {:background "#fff"
     :margin-top "-2.1em"
     :padding "1.6rem"}
    [:.nav
     {:margin-left "17%"}]]

   [:.user-panel
    [:.panel-heading
     {:text-align "center"}]
    [:.edit-btn
     {:position "relative"
      :top "-3.4em"}]
    [:.panel-body
     {:margin "15px 30px"}]
    [:.save-btn
     {:margin-top "20px"
      :width "100%"}]
    [:.form-control
     {:display "inline-block"
      :width "auto"}]]

   [:.vcenter
    {:display "inline-block"
     :vertical-align "middle"
     :float "none"}]

   [:.user-thumbnail
    {:max-height "64px"
     :max-width "64px"}]

   [:.panel
    {:border "1px solid #ddd"}]])

(defn generate-and-inject-style-tag
  "Injects a style tag with the id 'injected-css' into the page's head tag
   Returns generated style tag"
  []
  (let [ page-head (.-body js/document)
         style-tag (.createElement js/document "style")]
       (.setAttribute style-tag "id" "injected-css")
       (.appendChild page-head style-tag)))

(defn update-page-css
  "Updates #injected-css with provided argument (should be some CSS string
   -- e.g. output from garden's css fn) If page does not have #injected-css then
   will create it via call to generate-and-inject-style-tag"
  [input-css]
  (let [ style-tag-selector "#injected-css"
         style-tag-query (.querySelector js/document style-tag-selector)
         style-tag (if (nil? style-tag-query)
                       (generate-and-inject-style-tag)
                       style-tag-query)]
       (aset style-tag "innerHTML" input-css)))

; Usage
; (Assumes you've required garden in your namespace)
; (Optionally throw this in your boot-reload / figwheel reload CB)
(update-page-css
    (garden/css styles))

; ---------------------------------------------------------------------------
; Pages
; ---------------------------------------------------------------------------

(defn navbar []
  [:nav.navbar.navbar-default.navbar-fixed-top
   [:div.container
    ;"<!-- Brand and toggle get grouped for better mobile display -->"
    [:div.navbar-header
     [:button.navbar-toggle.collapsed
      {:aria-expanded "false",
       :data-target "#bs-example-navbar-collapse-1",
       :data-toggle "collapse",
       :type "button"}
      [:span.sr-only "Toggle navigation"]
      [:span.icon-bar]
      [:span.icon-bar]
      [:span.icon-bar]]
     [:a.navbar-brand
      {:href "/"}
      "\n            FaceClone"]]
    ;"<!-- Collect the nav links, forms, and other content for toggling -->"
    [:div#bs-example-navbar-collapse-1.collapse.navbar-collapse
     ;"<!-- search bar -->"
     [:form.navbar-form.navbar-left
      [:div.form-group
       [:input.form-control
        {:placeholder "Search for Users", :type "text"}]]]
     ;"<!-- user dropdown -->"
     [:ul.nav.navbar-nav.navbar-right
      [:li.dropdown
       [:a.dropdown-toggle
        {:aria-expanded "false",
         :aria-haspopup "true",
         :role "button",
         :data-toggle "dropdown",
         :href "#"}
        "\n                Henry\n              "]]]]]])

(defn cover []
  [:div.jumbotron
   [:div.container
    [:div.dp
     [:a.dp-profile-name
      {:href "#"}
      [:img.dp-img
       {:alt "user image",
        :src
        "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/harry_potter_small.jpg"}]
      "\n            Henry Potter\n            "
      [:i.glyphicon.glyphicon-ok]]]]])

(defn nav []
  [:div.timeline-nav
   [:div.container
    [:div.nav.nav-pills
     [:li.active [:a {:href "#"} "Timeline"]]
     [:li [:a {:href "about.html"} "About"]]
     [:li
      [:a
       {:href "friends.html"}
       "Friends "
       [:span.label.label-primary "26k"]]]
     [:li
      [:a
       {:href "photos.html"}
       "Photos "
       [:span.label.label-primary "555"]]]
     [:li.pull-right
      [:a {:href "about_edit.html"} "Edit profile"]]]]])


(def pages
  {:home #'home/home-page
   :timeline #'timeline-page})

(defn page []
  [:div
   [navbar]
   [cover]
   [nav]
   [(pages @(rf/subscribe [:page]))]])

; ---------------------------------------------------------------------------
; Routes
; ---------------------------------------------------------------------------

(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
  (rf/dispatch [:set-active-page :home]))

(secretary/defroute "/timeline" []
  (rf/dispatch [:set-active-page :timeline]))

; ---------------------------------------------------------------------------
; History
; ---------------------------------------------------------------------------
;; must be called after routes have been defined
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
      HistoryEventType/NAVIGATE
      (fn [event]
        (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

;; -------------------------
;; Initialize app
(defn fetch-docs! []
  (GET "/docs" {:handler #(rf/dispatch [:set-docs %])}))

(defn mount-components []
  (rf/clear-subscription-cache!)
  (r/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (rf/dispatch-sync [:initialize-db])
  (load-interceptors!)
  (fetch-docs!)
  (hook-browser-navigation!)
  (mount-components))
