(ns pooface.style
  (:require [garden.core :refer [css]]))

(css
 {:output-to "resources/public/style.css"}
  [:h1 {:width "100%" :margin-top "10em" :text-align "right" :color "#B20000" :font-family "sans-serif"}])
