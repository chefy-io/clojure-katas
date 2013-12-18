(ns clojure-katas.nth-fibonacci
  (:require [clojure-katas.core :as core]))

(core/defproblem nth-fib-tree
  "run time: O(2^n), calling itself at each recursion
   if n = 0 or n = 1: return 1
   else fib(n) = fib(n-1) + fib(n-2)"
  [n])

(core/defproblem nth-fib-iter
  "run time: O(n) iterate n times
   x: first start num,
   y: second start num,
   n: nth iterative, stopping num
   each iter:
     y <- x + y
     x <- y"
  [n])