(ns clojure-katas.greatest-common-divisor)

(defn gcd
  "Euclid algorithm:
  GCD(204, 40) = GCD(6, 40)
               = GCD(6, 4)
               = GCD(4, 2)
               = GCD(2, 0)"
  [x y]
  (if (zero? y)
    x
    (gcd y (rem x y))))