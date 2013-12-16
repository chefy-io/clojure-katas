(ns clojure-katas.sine-angle-test
  (:use clojure.test
        clojure-katas.sine-angle))

(deftest sine-angle-test
  (testing "approximate sine of an angle close enough"
    (is (= 0.1 (sine 0.1)))
    (is (= -0.39980345741334 (sine 12.15)))))