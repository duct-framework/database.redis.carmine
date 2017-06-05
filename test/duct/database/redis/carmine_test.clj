(ns duct.database.redis.carmine-test
  (:require [clojure.test :refer :all]
            [duct.database.redis.carmine :refer :all]
            [integrant.core :as ig]))

(deftest key-derive-test
  (is (isa? :duct.database.redis/carmine :duct.database/redis))
  (is (isa? :duct.database/redis :duct/database)))

(deftest init-key-test
  (is (= (ig/init-key :duct.database.redis/carmine {:spec {:host "127.0.0.1" :port 6379}})
         (map->Boundary {:conn-opts {:spec {:host "127.0.0.1", :port 6379}}}))))
