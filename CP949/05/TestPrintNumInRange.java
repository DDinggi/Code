/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
          System.out.println("1~100���� �� ������ �ԷµǾ����ϴ�");
      }
  }
}
