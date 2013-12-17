(ns clojure-katas.greatest-common-divisor-test
  (:use clojure.test
        clojure-katas.greatest-common-divisor))

(deftest greatest-common-divisor-test
  (testing "return GCD of a pair"
    (is (= 5 (gcd 75 10)))
    (is (= 3 (gcd 9 438)))))
