/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length !== t.length){
        return false;
    }
    
    t = t.split("");
    
    for(let i = 0;i<s.length;i++){
        
        if(t.indexOf(s[i]) > -1){
            t.splice(t.indexOf(s[i]),1);
        }
    }
    
    if(t.length > 0){
        return false;
    }else{
        return true;
    }
    
};
