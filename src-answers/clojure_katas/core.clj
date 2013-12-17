(ns clojure-katas.core
  "Helpers for writing problems.")

(defmacro defproblem
  [name docstring arglist & body]
  {:pre [(string? docstring) (vector? arglist)]}
  (if (empty? body)
    (throw (ex-info "Unimplemented problem"
                    {:symbol (symbol (str (.getName *ns*))
                                     (str name))}))
    `(defn ~name ~docstring ~arglist ~@body)))