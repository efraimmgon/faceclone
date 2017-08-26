(ns faceclone.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[faceclone started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[faceclone has shut down successfully]=-"))
   :middleware identity})
