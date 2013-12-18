(ns clojure-katas.procedural-sum)

(defn sum
  [f x y]
  (reduce + (mapv f (range x (inc y)))))

(defn sum-integers
  [x y]
  (sum (fn [x] x) x y))

(defn sum-cubes
  [x y]
  (let [cubes #(* % % %)]
    (sum cubes x y)))

