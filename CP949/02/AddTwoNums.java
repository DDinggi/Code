/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
        
        System.out.printf("�հ�: %.1f\n",num1 + num2);
    }
}
