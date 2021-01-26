/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

class PrintNumInRange {
    int value;
    Scanner scanner;

    PrintNumInRange(Scanner scanner) { this.scanner = scanner; }
    boolean isInRange(int min, int max) {
        return (value >= min && value <= max) ? true : false;
    }
    void printInt() { System.out.println(value); }17        
    void readInt() {
        System.out.print("정수를 입력하세요: ")
        value = scanner.nextInt();
    }
}
