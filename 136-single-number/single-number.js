/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let map = {};
    for(let i=0; i<nums.length; i++){
        let val = nums[i];
        if(map[val]){
            map[val]++;
        }else{
            map[val] = 1;
        }
    }
    for(key in map){
        if(map[key] === 1){
            return Number(key);
        }
    }
};