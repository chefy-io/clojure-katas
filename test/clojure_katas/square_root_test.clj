(ns clojure-katas.square-root-test
  (:use clojure.test
        clojure-katas.square-root))

(deftest square-root-test
  (testing "approximate square root with 0.001 tolerance"
    (is (<= 3.16 (sqrt 10.0 3.0 0.001)))
    (is (>= 3.17 (sqrt 10.0 3.0 0.001)))))