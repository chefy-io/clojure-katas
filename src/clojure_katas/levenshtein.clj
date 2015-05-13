(ns clojure-katas.levenshtein
  (:require [clojure-katas.core :as core]))

(core/defproblem levenshtein
  "Compute the amount of difference between two sequences,
   also known as edit distance. For example, the edit distance
   between kitten and sitten is 1 because we can simply replace
   k with s; the edit distance between hi and hit is 1 because
   we can remove t at the end of t"
  [str1 str2])
