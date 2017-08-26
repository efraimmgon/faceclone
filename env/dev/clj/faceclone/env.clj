(ns faceclone.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [faceclone.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[faceclone started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[faceclone has shut down successfully]=-"))
   :middleware wrap-dev})
