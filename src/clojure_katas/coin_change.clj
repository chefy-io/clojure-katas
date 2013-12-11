(ns clojure-katas.coin-change)

;http://clojure-euler.wikispaces.com/Problem+031

(defn change
  "returns an array of changes for the amount"
  [coins amount]
  (let [f (first coins)]
    (if = f 1) 1
      (reduce + (for [n (range 0 (inc (quot amount f)))]
                  (change (rest coins)(- amount (* n f)))))))