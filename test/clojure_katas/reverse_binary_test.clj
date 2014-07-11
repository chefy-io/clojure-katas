(ns clojure-katas.reverse-binary-test
  (:use clojure.test
        clojure-katas.reverse-binary))

; original source: Spotify Puzzles
;http://labs.spotify.com/puzzles/
(deftest reverse-binary-test
  (testing "reverse binary"
    (is (= 11 (reverse-binary 13))
    (is (= 61 (reverse-binary 47))))))
