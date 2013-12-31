(ns clojure-katas.integral-test
  (:use clojure.test
        clojure-katas.integral))

(deftest integral-test
  (testing "approximate integral of a function"
    (is (= 0.23078806666666699 (integral (fn [x] (* x x x)) 0 1 100)))
    (is (= 0.24800798800666718 (integral (fn [x] (* x x x)) 0 1 1000)))))