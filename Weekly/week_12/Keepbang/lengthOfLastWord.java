class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); //양쪽 공백 제거
        //문자열 마지막에서 공백의 index를 찾은 후 그 index부터 문자열 마지막까지 잘라 길이를 반환함
        return s.substring(s.lastIndexOf(" ")+1).length();
    }
}
