/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Map;
import java.util.HashMap;

class TestCountChars {
    String str;    
    TestCountChars(String s) { str = s; }
    
    Map<Character, Integer> countChars() {
        Map<Character, Integer> wc = new HashMap<Character, Integer>();
        char[] letters = str.toCharArray();
        for (char c : letters) {
            if (wc.containsKey(c)) {  // ���� ���ڰ� �ʿ� �����ϸ� 
                wc.put(c, wc.get(c) + 1); // ���� �����ؼ� 1 ������Ű�� �ٽ� ����
            }  else {
                wc.put(c,1);   // ó�� ��Ÿ�� �����̹Ƿ� 1�� ����
            }
        }
        return wc;  // ���� �ؽø� ��ȯ
    }    
    public static void main(String[] args) {
        TestCountChars tcc = new TestCountChars( "sangmyung university");
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);
    }
}
