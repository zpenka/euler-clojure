(ns euler-1.core
  (:gen-class))

; If we list all the natural numbers below 10 that are multiples of 3 or 5,
; we get 3, 5, 6 and 9. The sum of these multiples is 23.
;
; Find the sum of all the multiples of 3 or 5 below 1000

(defn euler-1
  "Algorithm to solve problem 1"
  [x]
  (reduce
    +
    (set (concat (range 0 x 3)
                 (range 0 x 5)))))

(time (println (euler-1 1000)))
