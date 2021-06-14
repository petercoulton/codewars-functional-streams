(ns codewars.core-test
  (:require [clojure.test :refer :all]
            [codewars.core :refer :all]))

(deftest fib
  (testing "0"
    (is (= 0 (first (fibS))))
    (is (= 1 (nth (fibS) 1)))
    (is (= 1 (nth (fibS) 2)))
    (is (= 2 (nth (fibS) 3)))
    ))
