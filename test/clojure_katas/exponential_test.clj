(ns clojure-katas.exponential-test
  (:use clojure.test
        clojure-katas.exponential))

(deftest multi-expt-correct
  (testing "different algorithm should give same result"
    (is (= 8 (expt-linear 2 3)))
    (is (= 8 (expt-fast 2 3)))))

(deftest multi-expt-compare
  (testing "expt-fast has a better running time"
    (is (< (time (expt-fast 20 1000)) (time (expt-linear 20 1000))))))