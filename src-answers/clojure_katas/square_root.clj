(ns clojure-katas.square-root)

; Goal: In numerical analysis, Newton's method is a method
; for finding successively better approximations to the roots
; of a real-valued function
;
; formula
; goal: x: f(x) = 0
; x_{1} = x_{0} - f(x_{0}) / f'(x_{0})
; x_{n+1} = x_{n} - f(x_{n}) / f'(x_{n})

(defn square
  [x]
  (* x x))

(defn average
  [x y]
  (/ (+ x y) 2))

(defn abs
  [x]
  (if (< x 0)
    (- x )
    x))

(defn good-enough?
  [x guess tol]
  (<= (abs (- (square guess) x)) tol))

(defn next-guess-for-sqrt
  "Constructing next guess based on Netwon formula for square root"
  [x guess]
  (average guess (/ x guess)))

(defn sqrt
  [x init tol]
  (loop [x x
         guess init
         tol tol]
    (if (not (good-enough? x guess tol))
      (recur x (next-guess-for-sqrt x guess) tol)
      guess)))