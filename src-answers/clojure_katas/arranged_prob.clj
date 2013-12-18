(ns clojure-katas.arranged-prob)

; Original problem source: http://projecteuler.net/problem=100

(defn prob
  "p: total population,
   m: total number of sub-category,
   n: number of consecutive draws"
  [p, m, n]
  (if (>= 0 n) 1
    (* (double (/ m p)) (prob (dec p) (dec m) (dec n)))))