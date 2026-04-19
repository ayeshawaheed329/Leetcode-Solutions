func containsNearbyDuplicate(nums []int, k int) bool {
    
    hashMap := make(map[int]int)

    for ind, val := range nums {

        prevInd, exist := hashMap[val]
        if exist {
            sub := ind - prevInd
            if sub <= k {
                return true
            }
        }
        hashMap[val] = ind
    }
    return false
}