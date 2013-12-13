(ns clojure-katas.nth-fibonacci-test
  (:use clojure.test
        clojure-katas.nth-fibonacci))

(deftest nth-fibonacci-test
  (testing "return nth fibonacci number"
    (is (= 0 (nth-fib -100)))
    (is (= 1 (nth-fib 0)))
    (is (= 1 (nth-fib 1)))
    (is (= 2 (nth-fib 2)))
    (is (= 3 (nth-fib 3)))
    (is (= 5 (nth-fib 4)))
    (is (= 8 (nth-fib 5)))))