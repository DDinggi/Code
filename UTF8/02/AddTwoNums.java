/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
// AddTwoNums.java
import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String numStr = sc.next();
        float num1 = Float.parseFloat(numStr);
        numStr = sc.next();
        float num2 = Float.parseFloat(numStr);
        
        System.out.printf("합계: %.1f\n",num1 + num2);
    }
}
