(defproject pooface "0.1.0-SNAPSHOT"
  :description "Pooface webapp"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [midje "1.5.1"]
                 [com.novemberain/monger "1.7.0"]
                 [garden "1.1.5" :exclusions [org.clojure/clojure com.google.guava/guava org.clojure/tools.reader]]]
  :plugins [[lein-ring "0.8.10"]
            [lein-midje "3.0.0"]]
  :ring {:handler pooface.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
