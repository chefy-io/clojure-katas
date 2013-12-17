(ns clojure-katas.nth-fibonacci
  (:require [clojure-katas.core :as core]))

(defn nth-fib-tree
  "run time: O(2^n), calling itself at each recursion
   if n = 0 or n = 1: return 1
   else fib(n) = fib(n-1) + fib(n-2)"
  [n])

(defn fib-iter
  "x: first start num,
   y: second start num,
   n: nth iterative, stopping num
   each iter:
     y <- x + y
     x <- y"
   [x y n]
   (loop [x x
          y y
          n n]
     (cond
       (< n 0) 0
       (= n 0) x
       :else (fib-iter (+ x y) x (- n 1)))))

(core/defproblem nth-fib-iter
  "run time: O(n) iterate n times"
  [n])