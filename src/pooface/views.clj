(ns pooface.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
      [:title "POO!"]
      (include-css "/style.css")]
    [:body
      [:h1 "Get some feedback!"]
      [:a {:href "http://google.com"} "Some Link"]]))
