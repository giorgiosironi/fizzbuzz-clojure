(ns fizzbuzz
  (:use clojure.test))
(def fizzbuzz (fn [x]
    (if (= x 3)
        "Fizz" 
        x)))
(deftest test1ShouldBeLeftUntouched
    (is (= 1 (fizzbuzz 1))))
(deftest test2ShouldBeLeftUntouched
    (is (= 2 (fizzbuzz 2))))
(deftest test3isFizz
    (is (= "Fizz" (fizzbuzz 3))))
(run-tests)
