(ns clojure-katas.roman-to-arabic
  (:require [clojure-katas.core :as core]))

(def roman-to-arabic-map
  {"I" 1 "V" 5 "X" 10 "L" 50 "C" 100 "D" 500 "M" 1000
   "IV" 4 "IX" 9 "XL" 40 "XC" 90 "CM" 900})

; reverse the map keys
(def arabic-to-roman-map
  (apply hash-map (mapcat reverse roman-to-arabic-map)))

(core/defproblem roman->arabic
  [roman]
  "pseudocode roman->arabic
    note: the algorithm is based on the data structure of the map
     we have 1) basic one char inside the map
             2) combination of two roman chars

    Input: a roman char sequence roman-chars = [c1, c2, c3,.. cn]
    Ouput: a decimal sequence result

    var result = 0
    var roman-chars = [c1, c2, c3,... cn]
    # define a recursion point
    var nums = arabic value map to current holder [c1, c2]


    for roman-chars
      # assign dynamic value holders
      c1 = first character of roman-chars (from left to right)
      c2 = second character of roman-chars
      rest-roman-chars = rest of roman-chars after chopping first 2 characters

      if rest-roman-chars has less than 2 chars # overall base case
        if roman-char has only 1 char # sub base case
          result = result + arabic_value_for_char(roman-char)
          recur the outer controll loop
        else # no char left
          return result
          NO recur
      else
        result = result + (num of string(c1, c2))
        recur the outer controll loop
    end")

(core/defproblem arabic->roman
  [arabic]
  "Pseudocode arabic to roman
    Input: an arabic number X, a map of arabic to roman maps, sorted from maximum to minimum
    Output: a sequence of roman chars

    assign var roman-sequence = []

    for ci in [c1, c2, ... cn] of arabic to roman maps, ordered from max to min
    if X (left to assign) = 0 # base case
      return roman-sequence
    else
      if X - ci >= 0
        append ci to the tail of roman-sequence
        X = X - arabic_val_of(ci)
        recur
      else
        recur")
