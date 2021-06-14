(ns codewars.core)

(def headS first)

(def tailS rest)

(def repeatS repeat)

(def iterateS iterate)

(def cycleS cycle)

(defn fromStep [start step]
  (iterateS (partial + step) start))

(defn fromS [start]
  (fromStep start 1))

(def foldrS reduce)

(def filterS filter)

(def takeS take)

(def dropS drop)

(defn zipWithS [f c1 c2]
  (map f c1 c2))

(defn fmap [f col]
  (map f col))

(defn fibS []
  (defn fibn [n]
    (case n
      0 0
      1 1
      (+ (fibn (- n 2)) (fibn (- n 1)))))
  (fmap fibn (fromS 0)))

(defn primeS []
  (defn sieve [[x & xs]]
    (cons x
          (lazy-seq
            (sieve (filterS #(not= 0 (mod % x))
                            (tailS xs))))))
  (sieve (fromS 2)))

(defn main [])

