class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] studentCloths = new int[n];

        for (int i = 0; i < studentCloths.length; i++) {
            studentCloths[i] = 1;
        }

        for (int i : reserve) {
            studentCloths[i-1] += 1;
        }

        for (int i : lost) {
            studentCloths[i-1] -= 1;
        }

        for(int idx : lost){
            //체육복이 없을때
            if(studentCloths[idx-1] == 0){
                if(idx != 1 && studentCloths[idx-2] > 1){//앞에 사람에게 빌림
                    studentCloths[idx-2] -= 1;
                    studentCloths[idx-1] += 1;
                }else if(idx < n && studentCloths[idx] > 1){//뒤에 사람에게 빌림
                    studentCloths[idx] -= 1;
                    studentCloths[idx-1] += 1;
                }
            }
        }

        int answer = 0;

        for (int i : studentCloths) {
            if( i > 0 ) answer++;
        }

        return answer;

    }
}