/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class StringPlus {
    public static void main(String[] args) {
        String s = "abc" + 3;
        System.out.println(s);
        s = "" + 3;
        System.out.println(s);
        s = 3.24 + "";
        System.out.println(s);
        s = 3.1415 + "는 PI 값이다";
        System.out.println(s);
        String newStr = s + '.';
        System.out.println(newStr);
        boolean b = 3 > 2;
        String str = "3 > 2는 " + b + " 입니다";
        System.out.println(str);
        System.out.println(2 + 3 + " = 23일까?");
        System.out.println("" + 2 + 3 + " = 23일까?");
    }
}
