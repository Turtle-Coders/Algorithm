/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    let result = "";
    let flag = true;
    strs.sort();
    
    let str = strs[0];
    
    if(str == null){
        return result;
    }
    
    for(let i = 0;i<str.length;i++){
        for(let j = 1;j<strs.length;j++){
            if(str[i] !== strs[j][i]){
                flag = false;
                break;
            }
        }
        if(flag){
            result += str[i];    
        }else{
            break;
        }
        
    }
    
    return result;
    
};
