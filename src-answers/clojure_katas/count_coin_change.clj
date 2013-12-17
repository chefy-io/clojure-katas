(ns clojure-katas.count-coin-change)

; SICP problem: count coin change
; How many different ways can we make change of $1.00, given half-dollars, quarters, nickels, and pennies?
; More generally, can we write a procedure to compute the number of ways to change any given amount of money?

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
      (= amount 0) 1
      (or (< amount 0) (< index 0)) 0
      :else (+ (count-coin-change-tree amount (- index 1))
               (count-coin-change-tree (- amount (nth coins index)) index)))))