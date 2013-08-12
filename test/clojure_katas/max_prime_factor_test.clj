(ns clojure-katas.max-prime-factor-test
  (:use clojure.test
        clojure-katas.max-prime-factor))

(deftest max-prime-factor-test
  (testing "return the maximum prime factor for an integer"
    (is (= 13 (max-prime-factor 78)))
    (is (= 5 (max-prime-factor 10)))
    (is (= 29 (max-prime-factor 13195)))
    (is (= 6857 (max-prime-factor 600851475143)))))