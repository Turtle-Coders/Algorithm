/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {

    let map = {};
    for(let i = 0 ; i < strs.length ; i++){

        let str = strs[i];

        //글자 나누고 정렬해서 병합
        str = str.split("").sort().join("");

        //hash map에 해당 문자가 있으면 strs에 값을 입
        if(!map[str]){
            map[str] = new Array();
            map[str].push(strs[i]);
        }else{
            map[str].push(strs[i]);
        }
    }


    //hashmap에 있는 배열을 꺼내서 output배열에 넣어서 출력형태로 변환
    let output = [];
    for(let key in map){
        output.push(map[key])
    }

    return output;


};