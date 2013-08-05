# clojure-katas
Learn to program Clojure by solving some handy problems..
Inspired by Groupon Clojure lunch

## Contributing
If you have small interesting problems for hands-on pratice, please share! :)

## List of existing problems
* Roman, arabic conversion
  - How to construct map and its reverse map
  - Destructuring in Clojure
  - `if-let` performs evaluation and assignment
  - Tail recursion in clojure using `loop` and `recur`

* Newton's method
  - Re-familiarize with approximation using Newton methods
  - Tail recursion in clojure using `loop` and `recur`

* Bayesian analysis
  - Learn how to use [incanter](https://github.com/liebke/incanter)


## Newbie Notes
1. What's the difference between `def` and `defn`?

  > `def`s are evaluated only once wehereas `defn`s (with or without arguments) are evaluated (execuated) every time they are called. If your function alweays return the same value, you can change them to `def`s.

2. Access Java library using dollar sign (Java interop)
  Rescource from [Java interop with Clojure and Mahout](http://pseudofish.com/java-interop-with-clojure-and-mahout.html): Java allows for classes to be nested. However, Clojure doesn't provide an obvious way of referencing them.

  For example, Hadoop’s SequenceFile includes SequenceFile.Writer and SequenceFile.Reader.
  To access these in Clojure, the period is replaced by a dollar sign.

    ...
      write (SequenceFile$Writer. fs conf path
                                  (class Text)
                                  (class VectorWritables))
    ...

## Other source of ideas
[Project Euler](http://projecteuler.net/problems)