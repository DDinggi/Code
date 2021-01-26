/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
            if (wc.containsKey(c)) {  // 만약 문자가 맵에 존재하면 
                wc.put(c, wc.get(c) + 1); // 값을 추출해서 1 증가시키고 다시 저장
            }  else {
                wc.put(c,1);   // 처음 나타난 문자이므로 1을 저장
            }
        }
        return wc;  // 최종 해시맵 반환
    }    
    public static void main(String[] args) {
        TestCountChars tcc = new TestCountChars( "sangmyung university");
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);
    }
}
