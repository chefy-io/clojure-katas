(ns clojure-katas.procedural-sum-test
  (:use clojure.test
        clojure-katas.procedural-sum))

(deftest sum-integers-test
  (testing "sum between two integers"
    (is (= 10 (sum-integers 1 4)))))

(deftest sum-cubes-test
  (testing "sum cubes between two integers"
    (is (= 3025 (sum-cubes 1 10)))))