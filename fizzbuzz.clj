(ns fizzbuzz
  (:use clojure.test))
(deftest test1ShouldBeLeftUntouched
    (is (= 1 (fizzbuzz 1))))
(run-tests)
