# Clojure Katas

This project contains a set of problems to help you get your hands dirty
with Clojure. I hope we can add more problems and treat this as an
ongoing project.

## Get started
The project is set up so that you can solve problems one by one. All the
problem skeletons are set up [here](https://github.com/marshallshen/clojure-katas/tree/master/src/clojure_katas), which is the place you can put
your solutions.

### Set up your environment
We need Java and Clojure to be configured on your machine. If you are a
Windows user, please visit [this page](http://www.java.com/en/download/help/windows_manual_download.xml)
on how to install Java. If you are a Mac OS user, please make sure that
your XCode is updated to include updated Java.

Java version needs to be 1.5 or up; Clojure version needs to be 1.5 or up.

Clojure Katas also relies on [Leiningen](http://leiningen.org/), a Clojure dependency management tool. After you installed Java and Clojure, you can follow [their install instruction](http://leiningen.org/#install) to install Leiningen.

### Run Clojure Katas

To verify your answer, you can run:


    $ lein katas-run

We also implemented solution manual, to run katas with their solutions;


    $ lein katas-answers

## Look for contributors
We want to keep this project ongoing, if you are interested in helping
out, feel free to:

  1. Open an issue (I will try to be as responsive as possible! :-)).
  2. Submit a Pull Request (bugfix, or submit a new problem!)

If you have any questions, feel free to messaage me on Github or Twitter: @marshallshen

Many thanks to [the contributors](https://github.com/marshallshen/clojure-katas/graphs/contributors), you made this project awesome!

### Example: solve a kata
-----------------------------
Say *arranged-prob* is not implemented under `/src/clojure_katas/sine_angle.clj`:

    $ lein katas-run
    Performing task 'run' with profile(s): 'test'
    Current kata to tackle:  clojure-katas.sine-angle/sine
    false

After *arranged-prob* is implemented, it moves to the next problem:

    Performing task 'run' with profile(s): 'test'

    Testing clojure-katas.sine-angle-test

    Ran 1 tests containing 2 assertions.
    0 failures, 0 errors.
    Current kata to tackle:  clojure-katas.arranged-prob/prob
    false

### Example: create a new kata
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

When using `core/defproblem`, you are **required** to put comments to
describe the problem.

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


## Current Dependency
- Clojure 1.5.1
- Leiningen 2.4.1

