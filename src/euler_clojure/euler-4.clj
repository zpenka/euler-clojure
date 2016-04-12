(ns euler-4.core
  (:gen-class))

; A palindromic number reads the same both ways. The largest palindrome made
; from the product of two 2-digit numbers is 9009 = 91 × 99.
;
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palindrome?
  [x]
  (= (reverse (str x)) (seq (str x))))

(defn find-largest-palindrome
  [interval-min interval-max]
  (apply
    max
    (filter palindrome?
      (for [a (range interval-min interval-max)
            b (range interval-min interval-max)]
          (* a b)))))

(time (println (find-largest-palindrome 100 1000)))
