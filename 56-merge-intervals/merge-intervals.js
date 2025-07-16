/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
    if (!intervals.length) return [];

    intervals.sort((a, b) => a[0] - b[0]);
    let start = intervals[0][0];
    let end = intervals[0].at(-1);
    const result = [];
    for(let i=1; i<intervals.length; i++){
        const interval = intervals[i];
        if(end >= interval[0]){
            end = Math.max(end, interval.at(-1));
        }else{
            result.push([start,end]);
            start =  interval[0];
            end = interval.at(-1);
        }
    }
    result.push([start,end]);
    return result;
};