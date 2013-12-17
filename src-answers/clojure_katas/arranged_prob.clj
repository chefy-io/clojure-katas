(ns clojure-katas.arranged-prob)

; Original problem source: http://projecteuler.net/problem=100

(defn prob
  "p: total population,
   m: total number of sub-category,
   n: number of consecutive draws"
  [p, m, n]
  (if (>= 0 n) 1
    (* (double (/ m p)) (prob (- p 1) (- m 1) (- n 1)))))