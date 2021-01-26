/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Map;
import java.util.HashMap;

class TestCountDigitsAndLetters {
    private String str;
    
    public TestCountDigitsAndLetters(String s) { str = s; }    
    public Map<String, Integer> countDigitsAndLetters() {
        Map<String, Integer> wc = new HashMap<String, Integer>();
        char[] letters = str.toCharArray();
        String keyName;
        for (char ch : letters) {
            if (Character.isDigit(ch)) {
                keyName = "DIGITS";
            } 
            else {
                keyName = "LETTERS";
            }
            if (wc.containsKey(keyName)) {
                wc.put(keyName, wc.get(keyName) + 1);
            } 
            else {
                wc.put(keyName, 1);
            }
        }    
        return wc;
    }
    
    public static void main(String[] args) {
        String str = "sangmyung1 university2";
        TestCountDigitsAndLetters tcdl = new TestCountDigitsAndLetters(str);
        Map<String, Integer> wc = tcdl.countDigitsAndLetters();
        System.out.println(wc);
    }
}
