(ns fizzbuzz
  (:use clojure.test))
(def fizzbuzz (fn [x] 1))
(deftest test1ShouldBeLeftUntouched
    (is (= 1 (fizzbuzz 1))))
(run-tests)
