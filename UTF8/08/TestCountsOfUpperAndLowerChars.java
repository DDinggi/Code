/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Map;

class TestCountsOfUpperAndLowerChars {
    public static void main(String[] args) {
        String str = "hello123with456 HELLO";
        CountsOfUpperAndLowerChars culcs = new CountsOfUpperAndLowerChars(str);
        Map<String, Integer> wc = culcs.getCountsOfUpperAndLowerChars();
        System.out.println(wc);
    }
}
