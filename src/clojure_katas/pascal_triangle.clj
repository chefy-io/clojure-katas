(ns clojure-katas.pascal-triangle)

(defn compute
  "Use tree recursion to solve pascal triangle,
   it builds up a tree of vars and uneccesarily
   builds up a stack in memory, highly ineffective"
  [row col]
  {:pre [(>= row 0)(>= col 0)]}
  (if (or (zero? col)
          (= col row))
    1N
    (let [row' (dec row)]
      (+ (compute row' (dec col))
         (compute row' col)))))

(defn compute-alt
  "Use iterative recursion to solve pascal triangle,
  computes out the triangle as we go,
    if row found -> return row[col]
    else computes the vals of the current row
  stop building
  and return the current iterating value for requested
  position."
  [row col]
  (loop [the-row [1N]
         at-row 0]
    (let [lookup #(if (contains? the-row %)(the-row %) 0)]
      (if (= at-row row)
        (nth the-row col)
        (recur
          (mapv (fn [at-col]
                  (+ (lookup (dec at-col))
                     (lookup at-col)))
                 (range (inc (count the-row))))
          (inc at-row))))))

