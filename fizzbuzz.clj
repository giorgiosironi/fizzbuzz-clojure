(ns fizzbuzz
  (:use clojure.test))
(def fizzbuzz (fn [x] 1))
(deftest test1ShouldBeLeftUntouched
    (is (= 1 (fizzbuzz 1))))
(deftest test2ShouldBeLeftUntouched
    (is (= 2 (fizzbuzz 2))))
(run-tests)
