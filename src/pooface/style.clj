(ns pooface.style
  (:require [garden.core :refer [css]]))

(css
 {:output-to "resources/public/style.css"}
  [:h1 {:width "100%" :margin-top "5em" :text-align "center" :color "#44a" :font-family "sans-serif"}])
