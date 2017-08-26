(ns user
  (:require [mount.core :as mount]
            [faceclone.figwheel :refer [start-fw stop-fw cljs]]
            faceclone.core))

(defn start []
  (mount/start-without #'faceclone.core/repl-server))

(defn stop []
  (mount/stop-except #'faceclone.core/repl-server))

(defn restart []
  (stop)
  (start))


