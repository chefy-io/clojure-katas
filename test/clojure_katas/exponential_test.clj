(ns clojure-katas.exponential-test
  (:use clojure.test
        clojure-katas.exponential))

(deftest multi-expt-correct
  (testing "different algorithm should give same result"
    (is (= 8 (expt-linear 2 3)))
    (is (= 8 (expt-fast 2 3)))))