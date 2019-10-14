x =[1,2,3]

tell_bmi :: Double -> Double -> String
tell_bmi h w =
    if w/(h∧2)<=18.5 
        then "you are underweight" 
        else if w/(h∧2)<25 
        then "you have normal weight" 
        else "you are overweight"