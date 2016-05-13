(defproject ipython-clojure "0.1.0-SNAPSHOT"
  :description "An IPython kernel for executing Clojure code"
  :url "http://github.com/roryk/ipython-clojure"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.zeromq/jeromq "0.3.4"] ; "0.3.5" (modern) fails on zmq/bind.
                 [cheshire "5.5.0"]
                 [clj-time "0.11.0"]
                 [pandect "0.5.4"]
                 [org.zeromq/cljzmq "0.1.4" :exclusions [org.zeromq/jzmq]]
                 [org.clojure/data.json "0.2.6"]
                 [com.cemerick/pomegranate "0.3.0"]
                 [mvxcvi/puget "1.0.0"]
                 [fipp "0.6.4"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :profiles {:dev {:dependencies [[alembic "0.3.2"]]}}
  :aot [ipython-clojure.core]
  :main ipython-clojure.core
  :jvm-opts ["-Xmx250m"]
  :keep-non-project-classes true)
