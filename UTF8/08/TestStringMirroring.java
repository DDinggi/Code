/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class TestStringMirroring {
    String mirror1(String hello) { // 방법 1
        StringBuilder olleh = new StringBuilder();
        for (int i = hello.length() - 1; i >= 0; i--) {
            olleh.append(hello.charAt(i));
        }
        return olleh.toString();
    }
    String mirror2(String hello) { // 방법 2
        char[] chArr = hello.toCharArray();
        StringBuilder olleh = new StringBuilder();
        for (int i = chArr.length - 1; i >= 0; i--)
            olleh.append(chArr[i]);
        return olleh.toString();
    }
    
    public static void main(String[] args) {
        TestStringMirroring t = new TestStringMirroring();
        System.out.println(t.mirror1("sangmyung"));
        System.out.println(t.mirror2("university"));
    }
}
