(ns clojure-katas.square-root
  (:require [clojure-katas.core :as core]))

(core/defproblem sqrt
  "x: value to be estimated,
   init: intial value,
   tol: tolerance level
   Goal: In numerical analysis, Newton's method is a method
   for finding successively better approximations to the roots
   of a real-valued function

   formula
   goal: x: f(x) = 0
   x_{1} = x_{0} - f(x_{0}) / f'(x_{0})
   x_{n+1} = x_{n} - f(x_{n}) / f'(x_{n})"
  [x init tol])
