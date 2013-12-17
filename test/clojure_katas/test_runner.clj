(ns clojure-katas.test-runner
  (:require [clojure.test :as t]))

(def problem-namespaces
  '[clojure-katas.arranged-prob-test
    clojure-katas.bayesian-test])

(defn run-tests
  []
  (try
    (loop [nses problem-namespaces]
      (when-let [[ns & more] nses]
        (and (try
               (require ns)
               true ; continue
               (catch clojure.lang.ExceptionInfo e
                 (if (contains? (ex-data e) :symbol)
                   (let [sym (-> e ex-data :symbol)]
                     (println "You haven't implemented" sym)
                     false ; don't continue
                     )
                   (throw e))))
             (let [{:keys [error fail]} (t/run-tests ns)]
               (= 0 error fail))
             (recur more))))))
