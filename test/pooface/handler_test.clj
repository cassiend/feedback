(ns pooface.handler-test
  (:use midje.sweet
        pooface.handler))

(defn request [resource web-app]
   (web-app {:request-method :get :uri resource}))

(fact "we render index"
  (:status (request "/" app-routes)) => 200
  (:body (request "/" app-routes)) => (contains "Get some feedback"))
