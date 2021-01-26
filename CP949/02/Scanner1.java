/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
// Scanner1.java
import java.util.Scanner;

class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("출력 문자열: " + s);
        int num = sc.nextInt();
        System.out.println("출력 정수: " + num);
    }
}
