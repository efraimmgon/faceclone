(ns faceclone.pages.timeline)

(defn timeline-page []
  [:div.container
   [:div.row
    ;"<!-- sidebar -->"
    [:div.col-sm-4
     ;"<!-- about -->"
     [:div.panel.panel-default
      [:div.panel-heading.text-center
       "\n              About\n            "]
      [:div.panel-body
       [:p [:strong "Born on"] ": July 31st, 1990"]
       [:p [:strong "Went to School on"] ": Hogwarts"]
       [:p [:strong "Hometown"] ": Godrick's Hollow, England"]
       [:p [:strong "Currently lives"] ": Godrick's Hollow"]]]
     ;"<!-- photos -->"
     [:div.panel.panel-default
      [:div.panel-heading.text-center
       "\n              Photos\n            "]
      [:div.panel-body
       [:div.row
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]]
       [:div.row
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]]
       [:div.row
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]]]
       [:p.text-center [:a {:href "#"} "See More Photos"]]]]
     " "
     ;"<!-- friends -->"
     [:div.panel.panel-default
      [:div.panel-heading.text-center
       "\n              Friends\n            "]
      [:div.panel-body
       [:div.row
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]]
       [:div.row
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]
        [:div.col-sm-4
         [:div.thumbnail
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]
          [:p.text-center
           [:a {:href "#"}]
           [:a {:href "#"} "Hermione Granger"]]]]]
       "<!-- /friends -->"
       [:p.text-center [:a {:href "#"} "See More Friends"]]]]]
    " "
    [:div.col-sm-8
     ;"<!-- new post -->"
     [:div.panel.panel-default
      [:div.panel-heading.text-center
       "\n              Post\n            "]
      [:div.panel-body
       [:textarea.form-control
        {:placeholder "What's on your mind?", :cols "80", :rows "8"}]]
      [:div.panel-footer.text-right [:button.btn.btn-primary "Post"]]]
     ;"<!-- post -->"
     [:div.panel
      [:div.panel-heading
       [:div.media
        [:div.pull-left
         [:a
          {:href "#"}
          [:img.user-thumbnail
           {:alt "...",
            :src
            "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]
        [:div.media-body
         [:h4.media-heading [:a {:href "#"} "Hermione Granger"]]
         [:span.text-info "Posted on Thursday 6/1/2014"]]]]
      [:div.panel-body
       "\n              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n            "]
      [:div.panel-footer
       [:p
        [:a {:href "#"} "Like"]
        " |\n                "
        [:a {:href "#"} "Comment"]
        " |\n                "
        [:a {:href "#"} "Delete"]]]]
     ;"<!-- liked post -->"
     [:div.panel
      [:div.panel-heading
       [:div.media
        [:div.pull-left
         [:a
          {:href "#"}
          [:img.user-thumbnail
           {:alt "...",
            :src
            "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]
        [:div.media-body
         [:h4.media-heading [:a {:href "#"} "Hermione Granger"]]
         [:span.text-info "Posted on Thursday 6/1/2014"]]]]
      [:div.panel-body
       "\n              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n            "]
      [:div.panel-footer
       [:p
        [:a {:href "#"} "Like"]
        " |\n                "
        [:a {:href "#"} "Comment"]
        " |\n                "
        [:a {:href "#"} "Delete"]]
       [:p
        [:a {:href "#"} "Hermione Granger"]
        " likes this.\n              "]]]
     ;"<!-- post with comments and comment form -->"
     [:div.panel
      [:div.panel-heading
       [:div.media
        [:div.pull-left
         [:a
          {:href "#"}
          [:img.user-thumbnail
           {:alt "...",
            :src
            "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]
        [:div.media-body
         [:h4.media-heading [:a {:href "#"} "Hermione Granger"]]
         [:span.text-info "Posted on Thursday 6/1/2014"]]]]
      [:div.panel-body
       "\n              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n            "]
      [:div.panel-footer
       ;"<!-- actions -->"
       [:p
        [:a {:href "#"} "Unlike"]
        " |\n                "
        [:a {:href "#"} "Delete"]]
       ;"<!-- likes -->"
       [:p
        "\n                You and "
        [:a {:href "#"} "Hermione Granger"]
        " and 3 others like this.\n              "]
       ;"<!-- comments -->"
       [:ul.media-list
        ;"<!-- a comment -->"
        [:li.media
         [:div.pull-left
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]
         [:div.media-body
          [:p.media-heading
           [:a {:href "#"} "Hermione Granger"]
           " said on Thusday 6/1/2014:"]
          [:p
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."]
          [:p
           [:a {:href "#"} "Like"]
           " | 3 other people like this."]]]
        ;"<!-- another comment -->"
        [:li.media
         [:div.pull-left
          [:a
           {:href "#"}
           [:img.user-thumbnail
            {:alt "...",
             :src
             "https://s3.amazonaws.com/viking_education/web_development/web_app_eng/user_silhouette_generic.gif"}]]]
         [:div.media-body
          [:p.media-heading
           [:a {:href "#"} "Hermione Granger"]
           " said on Thusday 6/1/2014:"]
          [:p
           "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."]
          [:p
           [:a {:href "#"} "Like"]
           " | 3 other people like this. | "
           [:a {:href "#"} "Delete"]]]]]
       ;"<!-- comment form -->"
       [:p
        [:textarea.form-control
         {:placeholder "Write a comment...", :cols "80", :rows "8"}]]
       [:p.text-right
        [:button.btn.btn-danger "Cancel"]
        [:button.btn.btn-primary "Comment"]]]]]]])
