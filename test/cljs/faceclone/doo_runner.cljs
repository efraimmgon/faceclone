(ns faceclone.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [faceclone.core-test]))

(doo-tests 'faceclone.core-test)

