(ns clojure-katas.nth-fibonacci)

(defn nth-fib-tree
  "run time: O(2^n), calling itself at each recursion"
  [n]
  (cond
    (neg? n) 0
    (zero? n) 1
    (= n 1) 1
    :else (+ (nth-fib-tree (dec n)) (nth-fib-tree (- n 2)))))

(defn fib-iter
  "x: first start num,
   y: second start num,
   n: nth iterative, stopping num"
   [x y n]
   (cond
     (neg? n) 0
     (zero? n) x
     :else (fib-iter (+ x y) x (dec n))))

(defn nth-fib-iter
  "run time: O(n) iterate n times"
  [n]
  (fib-iter 1 0 n))