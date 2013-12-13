(ns clojure-katas.arranged-prob-test
  (:use clojure.test
        clojure-katas.arranged-prob))

; original source: Euler problem 100

(deftest arranged-prob-test
  (testing "conditional probability"
    ; 100 total chips, 50 blue chips
    ; what is the probability of drawing 2 blue chips in a row?
    (is (= (float 0.24747474) (float (prob 100 50 2))))
    ; 200 total chips, 10 blue chips
    ; what is the probability of drawing 3 blue chips in a row?
    (is (= (float 0.12311558) (float (prob 200 100 3))))))
