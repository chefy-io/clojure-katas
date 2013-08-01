# clojure-katas
Learn the joy of Clojure by solving some handy problems.

## List of problems
* Roman, arabic conversion
  - How to construct map and its reverse map
  - Destructuring in Clojure
  - `if-let` performs evaluation and assignment
  - Tail recursion in clojure using `loop` and `recur`

* Newton's method
  - Re-familiarize with approximation using Newton methods
  - Tail recursion in clojure using `loop` and `recur`


## Notes
1. What's the difference between `def` and `defn`?

  > `def`s are evaluated only once wehereas `defn`s (with or without arguments) are evaluated (execuated) every time they are called. If your function alweays return the same value, you can change them to `def`s.