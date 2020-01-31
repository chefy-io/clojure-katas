(ns clojure-katas.sine-angle
  (:require [clojure-katas.core :as core]))

(core/defproblem sine
  "The sine of an angle (specified in radians) can be computed
  by making use of the approximation sin x  x if x is sufficiently small,
  and the trigonometric identity:
    sin(r) = 3sin(r/3) -. 4sin^3(r/3)"
  [angle]
  (if (<= angle 0.1)
    angle
    (let [r3 (/ angle 3)
          cube #(* % % %)
          p (fn [x] (- (* 3 x) (* 4 (cube x))))]
        (p (sine r3)))))