/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
