/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

class PrintNumInRange {
    int value;
    Scanner scanner;

    PrintNumInRange(Scanner scanner) { this.scanner = scanner; }
    boolean isInRange(int min, int max) {
        return (value >= min && value <= max) ? true : false;
    }
    void printInt() { System.out.println(value); }        
    void readInt() {
        System.out.print("������ �Է��ϼ���: ")
        value = scanner.nextInt();
    }
}
