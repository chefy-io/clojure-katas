(ns clojure-katas.coin-change-test
  (:use clojure.test
        clojure-katas.coin-change))

(def coins [200 100 50 20 10 5 2 1])

; (deftest coin-change-greedy-test
;   (testing "return changes based on greedy algorithm"
;     (is (= [1 5] (change coins 6))
;     (is (= [1 15](change coins 16))))))

; (deftest coin-change-dynamic-programming-test
;   (testing "return changes based on dynamic programming"
;     (is (= [15 15](change coins 30)))))