(ns clojure-katas.num-to-nums-test
  (:use clojure.test
        clojure-katas.num-to-nums))

(deftest num-to-nums-test
  (testing "return a number in the array the number of times"
    (is (= [2 2] (num-to-nums [2])))

(deftest num-to-nums-test
  (testing "return multipler numbers in the array"
    (is (= [1 3 3 3](num-to-nums [1 3])))))