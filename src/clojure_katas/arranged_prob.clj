(ns clojure-katas.arranged-prob
  (:require [clojure-katas.core :as core]))

; Original problem source: http://projecteuler.net/problem=100
(core/defproblem prob
  "p: total number of chips,
   m: total number of blue chips,
   n: number of consecutive draws
   output: the probability of n consecutive draws of blue chips out of a bucket that has p chips,
   m out of p chips are blue

   example:
   If a box contains twenty-one coloured discs, composed of 15 blue discs and 6 red discs,
   and 2 discs were taken at random, it can be seen that the probability of taking 2 blue discs, P(BB) = (15/21)×(14/20) = 1/2."
  [p, m, n]
  (reduce * 
    (for [taken (range n)] 
      (/ (- m taken) 
         (- p taken)))))