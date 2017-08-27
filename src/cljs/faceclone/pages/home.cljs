(ns faceclone.pages.home)

(defn logged-out-navbar []
  [:nav.navbar.navbar-default
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
     [:h1 [:a.navbar-brand {:href "#"} "FaceClone"]]]
    ;"<!-- Collect the nav links, forms, and other content for toggling -->"
    [:div#bs-example-navbar-collapse-1.collapse.navbar-collapse
     [:div.navbar-form.navbar-right
      [:div.form-group
       [:label {:for "login_email"} "Email"]
       [:br]
       [:input#login_email.form-control {:type "text"}]]
      " "
      [:div.form-group
       [:label {:for "login_password"} "Password"]
       [:br]
       [:input#login_password.form-control {:type "text"}]]
      " "
      [:div.form-group
       [:label {:for ""} " "]
       [:br]
       [:button.btn.btn-default
        {:type "submit", :style {:margin-top "5px"}}
        "Log in"]]]]]])





(defn home-page []
  [:div.container
   [:div.row
    [:div.col-md-7
     [:div#info-msgs
      [:h2 "Connect with all your friends!"]
      [:ul
       [:li "See photos and updates in your news feed."]
       [:li "Post your status for the world to see from your profile"]
       [:li "Get in touch with your friends by \"friending\" them"]
       [:li "Like things because you're a positive person!"]]]]
    [:div.col-md-5
     [:div#signup-form
      [:h1 "Sign Up"]
      ;"<!-- name -->"
      [:div.row
       [:div.form-group.col-sm-6
        [:input.form-control
         {:placeholder "First Name", :type "text"}]]
       [:div.form-group.col-sm-6
        [:input.form-control
         {:placeholder "Last Name", :type "text"}]]]
      ;"<!-- email -->"
      [:div.form-group
       [:input.form-control
        {:placeholder "Your Email", :type "email"}]]
      ;"<!-- passwords -->"
      [:div.form-group
       [:input.form-control
        {:placeholder "Your New Password", :type "password"}]]
      [:div.form-group
       [:input.form-control
        {:placeholder "Confirm Your Password", :type "password"}]]
      ;"<!-- birthday -->"
      [:div.form-group
       [:label {:for "signup-birthday"} "Birthday"]
       [:input#signup-birthday.form-control {:type "date"}]]
      ;"<!-- gender -->"
      [:div.form-group
       [:label.radio-inline
        [:input {:value "", :name "", :type "radio"}]
        "\n                  Male\n                "]
       [:label.radio-inline
        [:input {:value "", :name "", :type "radio"}]
        "\n                  Female\n                "]]
      [:button.btn.btn-lg.btn-success.btn-block
       {:name "button", :type "button"}
       "Sign Up!"]]]]])
