(ns clojure-katas.integral)

(defn integral
  [f a b n]
  {:pre [(even? n)(< a b)]}
  (let [delta (double (/ (- b a) n))]
    (* (double (/ delta 3))
       (+ (f a)
          (f b)
          (reduce + (map (fn [x] (* 4 x)) (map f (range (+ a delta) (- b delta) (* 2 delta)))))
          (reduce + (map (fn [x] (* 2 x)) (map f (range (+ a (* 2 delta))(- b (* 2 delta))(* 2 delta)))))))))