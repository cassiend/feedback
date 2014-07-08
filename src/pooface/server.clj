(ns pooface.server
  (:require [monger.core :as mg]
            [monger.collection :as mc]
            [monger.query :as mq]))

(mg/connect-via-uri! "mongodb://localhost:27017/db")
