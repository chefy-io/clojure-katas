(ns clojure-katas.roman-to-arabic-test
  (:use clojure.test
        clojure-katas.roman-to-arabic))

(deftest roman-to-arabic-basics
  (testing "roman to arabic basics"
    (is (= 1 (roman->arabic "I")))
    (is (= 5 (roman->arabic "V")))))

(deftest roman-to-arabic-advanced
  (testing "roman to arabic addtions"
    (is (= 2 (roman->arabic "II")))
    (is (= 7 (roman->arabic "VII")))
    (is (= 31 (roman->arabic "XXXI")))
    (is (= 900 (roman->arabic "CM")))
    (is (= 1979 (roman->arabic "MCMLXXIX")))))

(deftest arabic-to-roman-basics
  (testing "arabic to roman basics"
    (is (= "I" (arabic->roman 1)))
    (is (= "V" (arabic->roman 5)))
    (is (= "X" (arabic->roman 10)))))

(deftest arabic-to-roman-advanced
  (testing "arabic to roman advanced"
    (is (= "II" (arabic->roman 2)))
    (is (= "VII" (arabic->roman 7)))
    (is (= "XXXI" (arabic->roman 31)))
    (is (= "CM" (arabic->roman 900)))
    (is (= "MCMLXXIX" (arabic->roman 1979)))))