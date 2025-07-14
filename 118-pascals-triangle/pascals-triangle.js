/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let result = [];
    for(let  i=0; i<numRows; i++){
        let arr = [];
        for(let j=0; j<=i; j++){
            if(j===0 || j===i){
                arr[j] = 1;
            }else{
                let temp = result[i-1];
                const newValue = temp[j-1] + temp[j];
                arr[j] = newValue;
            }
        }
        result.push(arr);
    }
    return result;
};