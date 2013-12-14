(ns clojure-katas.nth-fibonacci-test
  (:use clojure.test
        clojure-katas.nth-fibonacci))

(deftest nth-fibonacci-tree-test
  (testing "return nth fibonacci number, using tree recursion"
    (is (= 0 (nth-fib-tree -100)))
    (is (= 1 (nth-fib-tree 0)))
    (is (= 1 (nth-fib-tree 1)))
    (is (= 2 (nth-fib-tree 2)))
    (is (= 3 (nth-fib-tree 3)))
    (is (= 5 (nth-fib-tree 4)))
    (is (= 8 (nth-fib-tree 5)))))

(deftest nth-fibonacci-iter-test
  (testing "return nth fibonacci number, using iterative recursion"
    (is (= 0 (nth-fib-iter -100)))
    (is (= 1 (nth-fib-iter 0)))
    (is (= 1 (nth-fib-iter 1)))
    (is (= 2 (nth-fib-iter 2)))
    (is (= 3 (nth-fib-iter 3)))
    (is (= 5 (nth-fib-iter 4)))
    (is (= 8 (nth-fib-iter 5)))))
