(ns euler-3.core
  (:gen-class))

; What is the largest prime factor of the number 600851475143?


(defn get-max-prime-factor
  "max-prime-factor helper"
  [first-num first-cur limit]
  (loop [num first-num
         cur first-cur]
    (if (> cur limit)
      num
      (if (= num cur)
        num
        (if (zero? (mod num cur))
          (recur (/ num cur) cur)
          (recur num (inc cur)))))))

(defn max-prime-factor
  "Finds the max prime factor of a number"
  [num]
  (let [limit (long (Math/sqrt num))]
    (get-max-prime-factor num 2 limit)))

(time (println (max-prime-factor 600851475143)))
