(ns clojure.example.hello
  (:gen-class))
(require ‘clojure.java.io’)
(defn Example []
  (.exists (file "Example.txt")))
(Example)
