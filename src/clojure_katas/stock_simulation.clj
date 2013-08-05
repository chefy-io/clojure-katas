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
