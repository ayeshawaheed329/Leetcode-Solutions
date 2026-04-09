
func removeDuplicates(nums []int) int {
    
    k := 0
    priv := nums[0] - 1
    priv_index := -1
    for i := 0; i<len(nums); i++ {
        if nums[i]> priv {
            priv_index++
            nums[priv_index] = nums[i]
            priv = nums[i]
            k++
        }
    }
    return k
}