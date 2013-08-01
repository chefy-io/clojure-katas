(ns clojure-katas.newtons-method)

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

(defn next-guess
  "Constructing next guess based on Netwon formula"
  [x guess]
  (average guess (/ x guess)))

(defn sqrt
  [x init tol]
  (loop [x x
         guess init
         tol tol]
    (if (not (good-enough? x guess tol))
      (recur x (next-guess x guess) tol)
      guess)))