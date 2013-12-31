(ns clojure-katas.exponential)

(defn expt-linear
  "b^n = b*b^(n-1)
   b^0 = 1"
  [base index]
  {:pre [(not (and (neg? base)(neg? (dec index))))]}
  (if (zero? index)
    1N
    (* base (expt-linear base (dec index)))))

(defn expt-fast
  "b^n = (b^(n/2))^2 if n is even
   b^n = b*b^(n-1) if n is odd"
   [base index]
   {:pre [(not (and (neg? base)(neg? (dec index))))]}
   (let [b base
         n index
         square (fn [x] (* x x))]
    (cond
      (zero? index)
        1N
      (even? index)
        (square (expt-fast b (/ n 2)))
      :else
        (* b (expt-fast b (dec n))))))