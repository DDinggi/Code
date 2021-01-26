/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

public class InputInt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("0이 아닌 정수 한 개를 입력하세요. 100이상의 정수가 입력되면 종료됩니다.");
            num = scanner.nextInt();
            if (num == 0) {
                continue;
            }
            else {
                System.out.println(num);               
            }
        } while (num < 100);
    }
}
