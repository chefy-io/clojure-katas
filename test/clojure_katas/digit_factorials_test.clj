(ns clojure-katas.digit-factorials-test
  (:use clojure.test
        clojure-katas.digit-factorials))

(deftest digit-factorials
  (testing "Find the sum of all numbers below N which divide the sum of the factorial of their digits"
    (is (= 19 (digit-factorials 20)))))
