/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    
    let min = Infinity;
    let maxProfit = 0;
    for(let price of prices){
        if(price < min){
            min = price;
        }else {
            let profit = price - min;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
};