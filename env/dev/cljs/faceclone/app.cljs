(ns ^:figwheel-no-load faceclone.app
  (:require [faceclone.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
