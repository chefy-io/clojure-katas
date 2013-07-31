(ns clojure-katas.roman-to-arabic)

(def roman-to-arabic-map
  {"I" 1 "V" 5 "X" 10 "L" 50 "C" 100 "D" 500 "M" 1000})

(def arabic-to-roman-map
  (apply hash-map (mapcat reverse roman-to-arabic-map)))

; pseudocode roman->arabic
; Input: a roman string sequence
; Ouput: a decimal sequence
; http://clojurecljub.wordpress.com/2012/11/29/roman-numeral-kata/

(defn roman->arabic
  [roman]
  (loop [[c1 c2 & rest-c] roman
          arabic 0]
    (if-let [num (and c2 (get roman-to-arabic-map (str c1 c2)))]
      (expr1)
      (expr2))
    arabic))