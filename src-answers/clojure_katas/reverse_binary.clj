(ns clojure-katas.reverse-binary)

(defn decimal->binary
  [x]
  (Integer/toString x 2))

(defn binary->decimal
  [x]
  (Integer/parseInt x 2))

(defn reverse-binary
  [x]
  (-> x
      (decimal->binary)
      (clojure.string/reverse)
      (binary->decimal)))