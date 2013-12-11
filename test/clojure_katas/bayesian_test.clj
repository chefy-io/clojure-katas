(ns clojure-katas.bayesian-test
  (:use clojure.test
        clojure-katas.bayesian
        incanter.core incanter.stats
        incanter.io incanter.bayes))

(def simple-dataset
  (to-dataset [{:a 1 :b 2} {:a 1 :b 2}]))

(deftest incanter-basics
  (testing "basic uage of incanter using simple dataset"
    (is (= [:a :b] (col-names simple-dataset)))
    (is (= [3 3] ($map #(+ %1 %2) [:a :b] simple-dataset)))))

; test reading dataset
; implenmentation detail in src/clojure_katas/bayesian.clj
(deftest incanter-read-dataset
  (testing "reading data using incanter"
    (is (= [86 86 81 79 63 95 81 86 94] critical-rating))
    (is (= [93 85 88 87 82 82 94 78 83] audience-rating))))

; in initial distribution, each movie is equally likely
; to win best picture because we assume no knowledge about
; the distribution.
; therefore, each file should have E(x) ~= 0.11
(deftest test-initial-distr
   (testing "make sure we start with uniform distribution"
      (is (< 0.10 (mean (lincoln (initial-distr 9)))))
      (is (> 0.12 (mean (lincoln (initial-distr 9)))))
      (is (< 0.10 (mean (silver-lining-playbook (initial-distr 9)))))
      (is (> 1.12 (mean (silver-lining-playbook (initial-distr 9)))))))

(deftest posterior-after-critical
  (testing "probability for candidate change after critical rating"
    (is (>= 0.1 (first (quantile (lincoln (posterior-distr (prior-vec 9) critical-rating)) :probs [0.025 0.975]))))
    (is (<= 0.12 (last (quantile (lincoln (posterior-distr (prior-vec 9) critical-rating)) :probs [0.025 0.975]))))
    (is (>= 0.1 (first (quantile (silver-lining-playbook (posterior-distr (prior-vec 9) critical-rating)) :probs [0.025 0.975]))))
    (is (<= 0.12 (last (quantile (silver-lining-playbook (posterior-distr (prior-vec 9) critical-rating)) :probs [0.025 0.975]))))))

