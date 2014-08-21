(ns clojure-katas.digit-factorials
  (:require [clojure-katas.core :as core]))

(core/defproblem digit-factorials
  "19 is a curious number, as 1!+9!=1+362880=362881 which is divisible by 19.
  Find the sum of all numbers below N which divide the sum of the factorial of their digits.
  Note: as 1!,2!,⋯,9! are not sums they are not included.
  Input Format
  Input contains an integer N
  Output Format
  Print the answer corresponding to the test case.
  Constraints
  10≤N≤105
  Sample Input: 20
  Sample Output: 19"
  [num])
