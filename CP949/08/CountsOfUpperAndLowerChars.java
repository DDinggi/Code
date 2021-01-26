/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Map;
import java.util.HashMap;

class CountsOfUpperAndLowerChars {
    private String str;
    
    public CountsOfUpperAndLowerChars(String str) { this.str = str; }
    public Map<String, Integer> getCountsOfUpperAndLowerChars() {
        Map<String, Integer> wc = new HashMap<String, Integer>();
        char[] letters = str.toCharArray();
        String keyName;
    
        for (char ch : letters) {
            if (Character.isUpperCase(ch)) { keyName = "UPPER"; } 
            else if (Character.isLowerCase(ch)) { keyName = "LOWER"; } 
            else { keyName = "OTHERS"; }   
            if (wc.containsKey(keyName)) { 
                wc.put(keyName, wc.get(keyName) + 1);
            }
            else { wc.put(keyName,1); }
        }
        return wc;
    }
}
