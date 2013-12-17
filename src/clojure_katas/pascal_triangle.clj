(ns clojure-katas.pascal-triangle
  (:require [clojure-katas.core :as core]))

(core/defproblem compute
  "Use tree recursion to solve pascal triangle,
   it builds up a tree of vars and uneccesarily
   builds up a stack in memory, highly ineffective"
  [row col])

(core/defproblem compute-alt
  "Use iterative recursion to solve pascal triangle,
  computes out the triangle as we go,
    if row found -> return row[col]
    else computes the vals of the current row
  stop building
  and return the current iterating value for requested
  position."
  [row col])

