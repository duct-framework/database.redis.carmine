(ns duct.database.redis.carmine
  (:require [taoensso.carmine :as car]
            [integrant.core :as ig]))

(derive :duct.database.redis/carmine :duct.database/redis)
(derive :duct.database/redis         :duct/database)

(defrecord Boundary [conn-opts])

(defmethod ig/init-key :duct.database.redis/carmine [_ conn-opts]
  (->Boundary conn-opts))
