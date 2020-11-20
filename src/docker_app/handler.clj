(ns docker-app.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.adapter.jetty :refer [run-jetty]]
            [compojure.core :refer [defroutes GET]]))


(defroutes route
  (GET "/" _ "okk"))

(def server
  (run-jetty #'route {:port 8081 :join? false}))

(.stop server)

(defn -main
  [& args]
  (run-jetty #'route {:port 8081 :join? false}))
