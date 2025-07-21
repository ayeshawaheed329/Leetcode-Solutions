/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    
    let result = "1";
    for(let i=2; i<=n; i++){
        console.log("passing >> ",result);
        result = counter(result);
    }

    return result;

    function counter(word){
        let prev = word[0];
        let count = 0;
        let ans = "";

        for(let i=0; i<word.length; i++){
            if(prev === word[i]){
                count ++;
            }else{
                ans += count + prev;
                count=1;
            }
            prev = word[i];
        }
        ans += count + prev;
        return ans;
    }
};