(ns projecteuler.test.utils
  (:use [projecteuler.core])
  (:use [projecteuler.utils])
  (:use [clojure.test])
  (:use [clojure.java.io]))

(deftest test-palindrome
  (assert (= true (palindrome? 1111)))
  (assert (= true (palindrome? 1234567890987654321)))
  (assert (= true (palindrome? 123456789987654321)))
  (assert (= false (palindrome? 1211))))

(deftest test-triangle-numbers
  (assert (=  1 (triangleNumber 1)))
  (assert (=  3 (triangleNumber 2)))
  (assert (=  6 (triangleNumber 3)))
  (assert (= 10 (triangleNumber 4)))
  (assert (= 15 (triangleNumber 5)))
  (assert (= 21 (triangleNumber 6)))
  (assert (= 28 (triangleNumber 7)))
  (assert (= 36 (triangleNumber 8)))
  (assert (= 45 (triangleNumber 9)))
  )
