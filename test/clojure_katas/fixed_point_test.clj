(ns clojure-katas.fixed-point-test
  (:use clojure.test
        clojure-katas.fixed-point)
  (:require [clojure.contrib.math :as math]))

(deftest fixed-point-test
  (testing "approximate val using fixed-point"
    (is (= 1.0000846162726942 (fixed-point math/sqrt 4.0)))
    (is (= 1.00009823711941 (fixed-point math/sqrt 5.0)))))
