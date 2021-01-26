/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

public class Divisor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 만들기 
        // 정수 2개 입력 받기
        int num1, num2;
        
        System.out.println("정수 2 개를 순차적으로 입력하세요: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();            
        // 약수인지 확인하고 출력하기
        if ((num2 % num1) == 0) {
            System.out.printf("%d은(는) %d의 약수입니다.", num1, num2);
        }
        else {
            System.out.printf("%d은(는) %d의 약수가 아닙니다.", num1,num2);
        }
    }
}
