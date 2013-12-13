(ns clojure-katas.nth-fibonacci)
; return nth fibonacci number

(defn nth-fib
  [n]
  (loop [n n]
    (cond
      (> 0 n) 0
      (= 0 n) 1
      (= 1 n) 1
      :else (+ (nth-fib (- n 1)) (nth-fib (- n 2))))))