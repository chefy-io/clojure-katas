(ns clojure-katas.levenshtein-test
  (:use clojure.test
        clojure-katas.levenshtein))

(deftest levenshtein-test
  (testing "return edit distance between two strings"
    (is (= 3 (levenshtein "kitten" "sitt")))))

