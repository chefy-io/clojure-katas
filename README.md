# Clojure Katas
## Current Dependency
- Clojure 1.5.1
- Leiningen 2.4.1

# What
Set of small problems from [Structure and Interpretation of Computer Program](http://mitpress.mit.edu/sicp/)
and [Project Euler](http://projecteuler.net/)

# Why
If you're interested in learning Clojure and look for small problems to practice,
hope this package can be of help!

# How
You can use this package to:
- Solve existing problems
- Create new problems

## Run katas:

    $ lein katas-run
## Run katas with implemented answers:

    $ lein katas-answers

## Solve existing problems
### Example: Solve sine angle
-----------------------------
When *arranged-prob* is not implemented under `/src/clojure_katas/sine_angle.clj`:

    $ lein katas-run
    Performing task 'run' with profile(s): 'test'
    Current kata to tackle:  clojure-katas.sine-angle/sine
    false

After *arranged-porb* is implemented, it moves to the next problem:

    Performing task 'run' with profile(s): 'test'

    Testing clojure-katas.sine-angle-test

    Ran 1 tests containing 2 assertions.
    0 failures, 0 errors.
    Current kata to tackle:  clojure-katas.arranged-prob/prob
    false

## Create new problems
### Example: create arranged probability problem
-------------------------------------------------
Create `/src-answers/clojure-katas/arranged_prob.clj` for solution.

```clojure
(defn prob
  "p: total population,
   m: total number of sub-category,
   n: number of consecutive draws"
  [p, m, n]
  (if (>= 0 n) 1
    (* (double (/ m p)) (prob (- p 1) (- m 1) (- n 1)))))
```
Create `/src/clojure-katas/arranged_prob.clj` for problem challenge.
** When using core/defproblem, doc is required. **

```clojure
(ns clojure-katas.arranged-prob
  (:require [clojure-katas.core :as core]))

(core/defproblem prob
 "required documentation goes here"
  [p, m, n])
```

Creates test under `/test/clojure-katas/arranged_prob_test.clj`

```clojure
(deftest arranged-prob-test
  (testing "conditional probability"
    (is (= (float 0.12311558) (float (prob 200 100 3))))))
```

Add *clojure-katas.arranged-prob-test* inside the problemsets defined in [test_runner](https://github.com/marshallshen/clojure-katas/blob/master/test/clojure_katas/test_runner.clj)

```clojure
(def problems
  '[clojure-katas.sine-angle-test
    clojure-katas.arranged-prob-test))
```

Run through solution to make sure it works:

    $ lein katas-answers

# Contributors
Many thanks to [Gary Federicks](https://github.com/fredericksgary) and [Robert Boyd](https://github.com/rboyd) for helping out on the prooject!

## Another great resources
* [Clojure Koans](http://clojurekoans.com/)
* [Project Euler](http://projecteuler.net/problems)
* [4Clojure](http://www.4clojure.com/)
