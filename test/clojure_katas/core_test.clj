(ns clojure-katas.core-test
  (:use clojure.test
        clojure-katas.core))

(deftest roman-to-arabic-basics
  (testing "roman to arabic basics"
  (is (= 1 (roman->arabic \I)))
  (is (= 5 (roman->arabic \V)))))

; (deftest roman-to-arabic-basics
;   (testing "basic characters are tranformed properly."
;     (is (= 1  (roman->arabic "I")))
;     (is (= 5  (roman->arabic "V")))
;     (is (= 10 (roman->arabic "X")))
;     (is (= 50 (roman->arabic "L")))
;     (is (= 100 (roman->arabic "C")))
;     (is (= 500 (roman->arabic "D")))
;     (is (= 1000 (roman->arabic "M"))))

; (deftest roman-to-arabic-addition
;   (testing "addition works properly"
;     (is (= 2 (roman->arabic "II")))
;     (is (= 7 (roman->arabic "VII")))
;     (is (= 31 (roman->arabic "XXXI")))))

; (deftest roman-to-arabic-subtraction
;    (is (= 4 (roman->arabic "IV")))
;    (is (= 900 (roman->arabic "CM"))))

; (deftest roman-to-arabic-both
;    (is (= 19 (roman->arabic "XIX")))
;    (is (= 1979 (roman->arabic "MCMLXXIX"))))

; (deftest roman-to-arabic-big-numbers
;    (is (= 29 (roman->arabic "XXIX")))
;    (is (= 38 (roman->arabic "XXXVIII")))
;    (is (= 291 (roman->arabic "CCXCI")))
;    (is (= 1999 (roman->arabic "MCMXCIX"))))
