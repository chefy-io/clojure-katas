(ns clojure-katas.sine-angle)

; The sine of an angle (specified in radians) can be computed
; by making use of the approximation sin x  x if x is sufficiently small,
; and the trigonometric identity:
;   sin(r) = 3sin(r/3) -. 4sin^3(r/3)

(defn sine
  [angle]
  (if (<= (Math/abs angle) 0.1)
    angle
    (let [ cube (fn [x](* x (* x x)))
           p (fn [x] (- (* 3 x) (* 4 (cube x))))]
       (p (sine (/ angle 3.0))))))