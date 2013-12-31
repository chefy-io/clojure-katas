(ns clojure-katas.integral
  (:require [clojure-katas.core :as core]))

(core/defproblem integral
  "compute integral using Simpson's Rule,
  the integral of a function f between a and b is approximated as:
  h/3*[y_0 + 4y_1 + 2y_2 + 4y_3 + 2y_4 + ... + 2y_{n-2} + 4y_{n-1} + y_n],
  where h = (b - a)/n, for some even integer n, and y_{k} = f(a+kh)"
  [f a b n])