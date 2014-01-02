(ns clojure-katas.fixed-point
  (:require [clojure-katas.core :as core]
            [clojure.contrib.math :as math]))

(defn fixed-point
  [f x]
  (let [tol 0.0001
    close-enough? (fn [v1 v2] ( < (math/abs (- v1 v2)) tol))]
    (loop [v1 x
      v2 (f x)]
      (if (close-enough? v1 v2)
        v2
        (recur v2 (f v2))))))
