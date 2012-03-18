(ns project-euler.euler001
  (:use clojure.math.numeric-tower)
)

;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

;Find the sum of all the multiples of 3 or 5 below 1000.

(defn sum-mod [x m]
  (/ (* (floor (/ x m)) (+ m (* (floor (/ x m)) m))) 2)
)

(defn euler001 []
  (+ 
    (sum-mod 999 3) 
    (sum-mod 999 5) 
    (- (sum-mod 999 15))
  )
)
