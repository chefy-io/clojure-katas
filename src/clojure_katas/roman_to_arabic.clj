(ns clojure-katas.roman-to-arabic)

(def numerals
  {\I 1
   \V 5
   \X 10
   \L 50
   \C 100
   \D 500
   \M 1000})

(defn roman->arabic
  [s]
  (get numerals s))