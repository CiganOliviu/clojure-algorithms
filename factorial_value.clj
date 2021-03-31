(defn get_factorial_value [number]
  (if (= number 1)
    1
    (* number (get_factorial_value(- number 1)))
  )
)