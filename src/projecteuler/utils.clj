(ns projecteuler.utils
    (:use [clojure.contrib.math]))

(defn prime?
  "Discovers if the number is a prime number"
  [n]
  (cond
   (== 1 n) false
   (== 2 n) true
   (even? n) false
   :else (->> (range 3 (inc (Math/sqrt n)) 2)
              (filter #(zero? (rem n %)))
              empty?)))

(def fibs
  "Creates fibonnaci sequence"
  (lazy-cat [0 1] (map + fibs (rest fibs))))

(defn square-of-sum [n]
  "Squares the sum of the number"
  (* (/ (* n (+ n 1)) 2)
     (/ (* n (+ n 1)) 2)))

(defn sum-of-squares [n]
  "Gets the sum of the square of the number"
  (/ (* n (+ 1 n) (+ (* 2 n) 1)) 6))

(defn sum-digits [s]
  "Sums the digits"
  (reduce + (map #(Integer/parseInt (str %)) s)))

(defn factorial [n]
  "Gets the factorial"
  (reduce *' (range 2 (inc n))))

(defn grid-combinations [m n]
  "Algorithm to get Pascals Triangle Combination number from a grid"
  (/ (factorial (+ m n))
     (*' (factorial m) (factorial n)) ))

(defn palindrome? [n]
  "Checks to see if the number is a Palindrome"
  (= (seq (str n)) (reverse (seq (str n)))))

(defn product-digits [s]
  "Gets the digits in a string and multiplys them"
  (reduce * (map #(Integer/parseInt (str %)) s)))

(defn num-string-to-list-nums [s]
  (cond
   (= (count s) 0) '()
   :else  (cons (Integer/parseInt (Character/toString (first s)) )
                (num-string-to-list-nums (rest s)))))

(defn convert-list [list function cons-digits]
  (cond
   (< (count list) cons-digits) '()
   :else (cons (reduce function (take cons-digits list)) (convert-list (rest list) function cons-digits))))

(defn divisors [n]
  (for [x (range 1 n)
        :let [y (mod n x)]
        :when (zero? y)]
    x))

(defn amicable? [n]
  (let [sumDiv (reduce + (divisors n))
        sumDiv2 (reduce + (divisors sumDiv))]
    (= (= sumDiv2 n) (not=  n sumDiv))))

(defn palindrome-base10-and-base2? [n]
  (cond
   (palindrome? n) (palindrome? (Integer/toBinaryString n))
   :else false))

(defn triangleNumber [n]
  (* n (/ (+ n 1) 2)))

(def triangles (map triangleNumber (iterate inc 1)))

(defn num-of-divisors [n]
  (* 2 (count (filter #(= (mod n %) 0) (range 2 (inc (int (sqrt n))))))))
