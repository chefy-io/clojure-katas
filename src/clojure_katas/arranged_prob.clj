(ns clojure-katas.arranged-prob
  (:require [clojure-katas.core :as core]))

; Original problem source: http://projecteuler.net/problem=100
(core/defproblem prob
  "p: total number of chips,
   m: total number of blue chips,
   n: number of consecutive draws
   output: the probability of n consecutive draws of blue chips out of a bucket that has p chips,
   m out of p chips are blue"
  [p, m, n])