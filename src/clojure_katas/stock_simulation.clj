(ns clojure-katas.stock-simulation
  (:use incanter.core incanter.stats
        incanter.charts))

; random walk hypothesis:
; the price tomorrow will be the price today + novelty.
(defn rand-walk
  "default novelty is set to
  1% of the base price"
  [price]
  (+ price (rand) (* -0.01 price)))

(defn rand-walk-bootstrap
  "simulate stock price using random walk hypothesis"
  [num, price]
  (take num (iterate rand-walk price)))

; if adding evenly distributed random numbers many times
; then you get numbers that approximate a normal distribution

(defn normal-distr
  [mean variance]
  (reduce + mean (repeatedly variance rand)))

;(view (histogram (repeatedly 1000 (normal-distr 100 5))))
