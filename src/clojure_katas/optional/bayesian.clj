(ns clojure-katas.bayesian
  (:use incanter.core incanter.stats
        incanter.io incanter.bayes incanter.charts)
  (:require [clojure-katas.core :as core]))

(def critical-rating
  ($ :rating (read-dataset "./data/oscar_critical_rating.csv"
                :header true)))
(def audience-rating
  ($ :rating (read-dataset "./data/oscar_audience_rating.csv"
                :header true)))
; assume data
(defn lincoln
  [data]
  (sel data :cols 1))

(defn silver-lining-playbook
  [data]
  (sel data :cols 2))

(defn prior-vec
  "Assume prior distribution as uniform distribution.
   We assume that each file has equal chance of winning.
   Prior vector is a vector with each value 100"
  [num-of-vars]
  (repeat num-of-vars 100))

(core/defproblem initial-distr
  "multinomial distribution is a generalization of the binomial distribution,
   For n independent trails each of which leads to a success for exactly one
   of k categories, with each category having a given fixed success probability.
   Assign 9 initial values for 9 best picture nominees"
  [num-of-vars])

(core/defproblem posterior-distr
  "Dirichlet distribution is a family of continuous multivariate probability
   distributions parameterized by a vector of positive real numbers
   the method is quite naive without other factors, it's used for demo,
   not necessarily the best modeling :P

   INPUT: vector of expected means for each var from prior distribution,
          vector of expected means for each var from likelihood"
  [prior-vec, likelihood-vec])