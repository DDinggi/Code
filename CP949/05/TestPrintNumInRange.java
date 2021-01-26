/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

class TestPrintNumInRange {
    public static void main(String[] args) {    
      Scanner scanner = new Scanner(System.in);
      PrintNumInRange printNumInRange = new PrintNumInRange(scanner);
      printNumInRange.readInt();
      if (printNumInRange.isInRange(1, 100)) {
          printNumInRange.printInt();
      }
      else {
          System.out.println("1~100범위 밖 정수가 입력되었습니다");
      }
  }
}
