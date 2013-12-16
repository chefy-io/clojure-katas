(ns clojure-katas.pascal-triangle-test
  (:use clojure.test
        clojure-katas.pascal-triangle))

(deftest pascal-triangle-test
  (testing "return elem of a pascal triangle"
    (is (= 1 (compute 0 0)))
    (is (= 75287520 (compute 100 5)))))

(deftest pascal-triangle-test-alt
  (testing "return elem after building the triangle"
    (is (= 1 (compute-alt 0 0)))
    (is (= 75287520 (compute-alt 100 5)))))