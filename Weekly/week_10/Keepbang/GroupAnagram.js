/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {

    let map = {};
    for(let i = 0 ; i < strs.length ; i++){

        let str = strs[i];

        str = str.split("").sort().join("");

        if(!map[str]){
            map[str] = new Array();
            map[str].push(i);
        }else{
            map[str].push(i);
        }
    }


    let output = [];
    for(let key in map){
        let group = [];
        for(let v of map[key]){
            group.push(strs[v]);
        }
        output.push(group);
    }

    return output;

};