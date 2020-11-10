/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let strArr = s.split(" ");
    let ptArr = pattern.split("");
    
    let counter = 1;
    
    for(let x of strArr){
        if(isNaN(x)){
            strArr = strArr.map((val)=>(val === x? counter: val))
            counter++;    
        }
    }
    
    counter = 1;
    
    for(let x of ptArr){
        if(isNaN(x)){
            ptArr = ptArr.map((val)=>(val === x? counter: val))
            counter++;    
        }
    }
    
    if(strArr.toString() === ptArr.toString())
        return true;
    else
        return false;
    
};
