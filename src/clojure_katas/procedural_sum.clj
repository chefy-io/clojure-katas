(ns clojure-katas.procedural-sum
  (:require [clojure-katas.core :as core]))

(core/defproblem sum-integers
  "x: start integer
   y: end integer
   output: return sum of integer from x to y

   example: (sum-integers 1, 4) > 1 + 2 + 3 + 4 = 10"
  [x y])

(core/defproblem sum-cubes
  "x: start integer
   y: end integer
   output: return sum of the cube of each integer from x to y

   example: (sum-cubes 1, 4) > 1 + 8 + 27 + 64 = 100"
  [x y])
