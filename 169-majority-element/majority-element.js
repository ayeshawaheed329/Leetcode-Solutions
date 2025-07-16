/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let map = {};
    for(num of nums){
        if(map[num]){
            map[num]++;
        }else{
            map[num]=1;
        }
    }
    const required_count = nums.length / 2;
    for(key in map){
        if(map[key] > required_count){
            return parseInt(key);
        }
    }
    return 0;
};