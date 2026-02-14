import (
    "fmt"
)

func twoSum(nums []int, target int) []int {

    dict := make(map[int]int)
    for i:=0; i < len(nums); i++ {
        dict[nums[i]] = i
    }

    for i:=0; i<len(nums); i++ {
        need := target - nums[i]
        if value, ok := dict[need]; ok && value != i{
            return []int{i, dict[need]}
        }
    }

    return []int{}
}