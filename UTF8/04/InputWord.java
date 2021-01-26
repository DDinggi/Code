/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

public class InputWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("단어 입력. quit을 입력하면 종료됨: ");
        word = scanner.next();
        while (!word.equals("quit")) {
            System.out.println(word);
            System.out.print("단어 입력. quit을 입력하면 종료됨: ");
            word = scanner.next();
        }
    }
}
