(ns projecteuler.test.core
  (:use [projecteuler.core])
  (:use [projecteuler.utils])
  (:use [clojure.test])
  (:use [clojure.java.io]))

(deftest test-palindrome
  (assert (= true (palindrome? 1111)))
  (assert (= true (palindrome? 1234567890987654321)))
  (assert (= true (palindrome? 123456789987654321)))
  (assert (= false (palindrome? 1211))))
