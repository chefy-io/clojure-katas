(ns clojure-katas.procedural-sum)

(defn sum-integers
  [x y]
  (reduce + (range x (inc y))))

(defn sum-cubes
  [x y]
  (let [cube #(* % % %)]
    (reduce + (mapv cube (range x (inc y))))))