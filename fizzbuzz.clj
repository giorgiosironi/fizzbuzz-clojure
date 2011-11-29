(ns fizzbuzz
  (:use clojure.test))
(def divides (fn [x divisor]
    (= 0 (mod x divisor))))
(def nameNumbers (fn [x mappingsOfNumbers] 
    (if (empty? mappingsOfNumbers)
        ""
        (let [divisor (key (first mappingsOfNumbers))
              value (val (first mappingsOfNumbers))]
            (if (divides x divisor)
                (str value (nameNumbers x (rest mappingsOfNumbers)))
                (nameNumbers x (rest mappingsOfNumbers)))))))
(def fizzbuzz (fn [x]
    (let [names (nameNumbers x {3 "Fizz" 5 "Buzz"})]
        (if (= "" names)
            x
            names))))
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
(deftest test10isBuzz
    (is (= "Buzz" (fizzbuzz 10))))
(deftest test15isFizzBuzz
    (is (= "FizzBuzz" (fizzbuzz 15))))
(run-tests)
