    
(ns core-test
  (:require [cljs.test :refer-macros [deftest testing is]]))

(deftest one-is-one
  (testing "if one equals one"
    (is (= 1 1))))