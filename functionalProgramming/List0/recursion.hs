factorial1 n = go n 1
    where
    go n res
        | n > 1     = go (n - 1) (res * n)
        | otherwise = res

reverse' :: [a] -> [a]
reverse' [] = []
reverse' (x:xs) = reverse xs ++ [x]