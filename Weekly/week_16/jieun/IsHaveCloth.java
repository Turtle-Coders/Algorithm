import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
		
        List<String> lostList    = new ArrayList<>();
        List<String> reserveList = new ArrayList<>();
		
        for (int lostStn : lost) {
          lostList.add(Integer.toString(lostStn));
        }

        for (int reserveStn : reserve) {
          reserveList.add(Integer.toString(reserveStn));
        }

        // 빌려주는 사람에서 자기 자신은 제외
        for (int reserveStn : reserve) {
          String reserveStnS = Integer.toString(reserveStn);
          for (int lostStnI : lost) {
            String lostStnS = Integer.toString(lostStnI);
            if (lostStnI == reserveStn) {
              reserveList.remove(reserveStnS);
              lostList.remove(lostStnS);
              break;
            }
          }
        }

        // 양옆에 안가져온사람이 있으면 여분있는 사람이 빌려줌
        for (String reserveStnS : reserveList) {
          int reserveStn = Integer.parseInt(reserveStnS);
          for (String lostStnS : lostList) {
            int lostStnI = Integer.parseInt(lostStnS);
            if (lostStnI +1 == reserveStn || lostStnI -1 == reserveStn) {
              lostList.remove(lostStnS);
              break;
            }
          }
        }

        answer = n - lostList.size();
        
        return answer;
    }
}
