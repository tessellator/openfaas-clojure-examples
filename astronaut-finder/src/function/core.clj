(ns function.core
  (:require [cheshire.core :as json]
            [clj-http.client :as client]
            [ring.util.response :refer [response]]))

(def data-url "http://api.open-notify.org/astros.json")

(defn astronauts []
  (-> data-url
      client/get
      :body
      (json/parse-string true)
      :people))

(defn random-astronaut []
  (rand-nth (astronauts)))

(defn app [_]
  (response (format "%s is in space!" (:name (random-astronaut)))))
