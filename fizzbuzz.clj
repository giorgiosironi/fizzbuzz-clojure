(ns fizzbuzz
  (:use clojure.test))
(def nameNumbers (fn [x mappingsOfNumbers] 
    (if (find mappingsOfNumbers x)
        (get mappingsOfNumbers x)
        x)))
(def fizzbuzz (fn [x]
    (nameNumbers x {3 "Fizz" 5 "Buzz"})))
(deftest test1ShouldBeLeftUntouched
    (is (= 1 (fizzbuzz 1))))
(deftest test2ShouldBeLeftUntouched
    (is (= 2 (fizzbuzz 2))))
(deftest test3isFizz
    (is (= "Fizz" (fizzbuzz 3))))
(deftest test5isBuzz
    (is (= "Buzz" (fizzbuzz 5))))
(deftest test6isFizz
    (is (= "Fizz" (fizzbuzz 6))))
(run-tests)
