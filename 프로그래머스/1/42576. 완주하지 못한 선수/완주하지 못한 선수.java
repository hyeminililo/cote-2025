import java.util.HashMap;

class Solution {
     public String solution(String[] participant, String[] completion) {
          HashMap<String, Integer> copyParticipant = new HashMap<>();

          String    answer = "";
          //  참가자 이름 있는 hashmap 생성 (동일인일 경우 숫자 추가)
          for (int i = 0; i < participant.length; i++) {
              copyParticipant.put(participant[i], copyParticipant.getOrDefault(participant[i], 0) + 1);

          }

          for (String completionName : completion) {
              copyParticipant.put(completionName, copyParticipant.get(completionName) - 1);

          }
          int j = 0;
          for (int i = 0; i < participant.length; i++) {
              if (copyParticipant.get(participant[i]) == 1) {
                  answer = participant[i];
                 return  answer;
              }
          }

return answer;
      }

}

