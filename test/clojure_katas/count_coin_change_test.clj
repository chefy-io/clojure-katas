(ns clojure-katas.count-coin-change-test
  (:use clojure.test
        clojure-katas.count-coin-change))

(deftest coin-to-change-test
  (testing "coins are well defined"
    (is (= coins [1 5 10 25 50]))))

(deftest count-coin-change-test
  (testing "return number of ways to make changes for a given amount"
    (is (= 292 (count-coin-change-tree 100 4)))))