(ns clojure-katas.stock-simulation-test
  (:use clojure.test
        clojure-katas.stock-simulation))

(deftest random-walk-simulation
  (testing "basics of random walk sim"
    (is (= 5 (count (rand-walk-bootstrap 5 1))))))

(deftest normal-distr-simulation
  (testing "simulate normal distribution"))
