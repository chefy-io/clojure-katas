(ns clojure-katas.max-prime-factor)

; largest prime factor
; Euler 3
; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143 ?


; Pseudo alg
; Given a number [num], and a ref to save largest prime [div]
; init div = 2
;
; Base cases:
;  if number = div, return number
;  if div > (number)^(1/2), return number (cover square case such as 4)
; Iterative case:
;  if number can be divided by div, then decrement number by the factor of div, loop
;  if number cannot be divided by div, then increment div by 1, loop

(defn max-prime-factor
  [number]
  (loop [number number
         div 2]
     (cond
       (> div (int (Math/sqrt number))) number
       (= number div) number
       (= 0 (rem number div)) (recur (/ number div) div)
       :else (recur number (inc div)))))

