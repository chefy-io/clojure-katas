(ns clojure-katas.fixed-point
  (:require [clojure-katas.core :as core]
            [clojure.contrib.math :as math]))

(core/defproblem fixed-point
    "A number x is called a fixed point of a function f
     if x satisfies the equation f(x) = x.

     For some functions f we can locate a fixed point
     by beginning with an initial guess and applying f repeatedly,

     Algorithm:
     (define tolerance 0.0001)
     (define (fixed-point f first-guess)
       (define (close-enough? v1 v2)
         (< (abs (- v1 v2)) tolerance))
       (define (try guess)
         (let ((next (f guess)))
           (if (close-enough? guess next)
               next
               (try next))))
       (try first-guess))

      For practice, let assume tolorance level is 0.0001"
    [f x])