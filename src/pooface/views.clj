(ns pooface.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
      [:title "POO!"]
      (include-css "/style.css")]
    [:body
      [:h1 "Get some POO!"]
      [:a {:href "http://google.com"} "Google Link"]]))
