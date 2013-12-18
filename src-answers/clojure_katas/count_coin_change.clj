(ns clojure-katas.count-coin-change)

(def coins [1 5 10 25 50])

(defn count-coin-change-tree
  "Solution 1 build tree recursion
  # of ways to change amount a using n kinds of coins =
    # of ways to change amount a using all but first kind of coin +
    # of ways to change amount a - d, where d is the denomination of the first kind of coin"
  [amount, index-of-coin-change]
  (loop [amount amount
         index index-of-coin-change]
    (cond
      (zero? amount) 1
      (or (neg? amount) (neg? index)) 0
      :else (+ (count-coin-change-tree amount (dec index))
               (count-coin-change-tree (- amount (nth coins index)) index)))))