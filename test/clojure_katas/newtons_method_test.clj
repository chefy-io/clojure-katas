(ns clojure-katas.newtons-method-test
  (:use clojure.test
        clojure-katas.newtons-method))

; Goal: find successively better approximations to the
;       roots of a real-valued function

; implement square root approximation using Clojure
(deftest square-root-test
  (testing "approximate square root with 0.001 tolerance"
    (is (<= 3.16 (sqrt 10.0 3.0 0.001)))
    (is (>= 3.17 (sqrt 10.0 3.0 0.001)))))