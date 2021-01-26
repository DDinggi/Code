/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

public class InputInt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("정수 한 개를 입력. 0이 입력되면 종료됩니다.");
            num = scanner.nextInt();
            // 0인지 확인하고 출력하거나 반복 종료
            if (num != 0) 
                System.out.println(num);
            else
                break;
        } while (true);
    }
}
