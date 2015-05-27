(defproject clojure-katas "0.1.0-SNAPSHOT"
  :description "A collection exercises solved in Clojure"
  :url "http://clojurekatas.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [incanter "1.5.1"]]
  :main clojure-katas.core
  :profiles {:answers {:source-paths ["src-answers"]}}
  :aliases {"katas-run"     ["with-profile" "test" "run" "-m" "clojure-katas.test-runner/run-tests"]
            "katas-answers" ["with-profile" "test,answers" "run" "-m" "clojure-katas.test-runner/run-tests"]})
