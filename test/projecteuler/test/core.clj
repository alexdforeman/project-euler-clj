(ns projecteuler.test.core
  (:use [projecteuler.core])
  (:use [projecteuler.utils])
  (:use [clojure.test]))

(deftest test-problem001
  (assert (= 233168 (problem001))))

(deftest test-problem002
  (assert(= 4613732 (problem002))))

(deftest test-problem003
  (assert(= 6857 (problem003 600851475143))))

(deftest test-problem004
  (assert(= 906609 (problem004))))

(deftest test-problem005
  (assert(= 232792560 (problem005))))

(deftest test-problem006
  (assert (= 25164150 (problem006 100))))

(deftest test-problem007
  (assert (= 104743 (problem007 10001))))

(deftest test-problem010
  (assert (=  142913828922 (problem010 2000000))))

(deftest test-problem015
  (assert (= 137846528820  (problem015))))

(deftest test-problem020
  (assert (= 648  (problem020 100))))
