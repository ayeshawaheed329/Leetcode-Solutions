/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    
    let i= 0;
    let j=s.length - 1;
    console.log("j ",j);
    while(i<=j){
        const start_char = s[i].toLowerCase();
        const end_char = s[j].toLowerCase();

        if(!(/^[a-z0-9]$/i.test(start_char))){
            i++;
            continue;
        }
        if(!(/^[a-z0-9]$/i.test(end_char))){
            j--;
            continue;
        }
        if(start_char !== end_char){
            return false;
        }else{
            i++;
            j--;
        }
        
    }
    return true;
};