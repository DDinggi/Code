/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class Divisor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner ��ü ����� 
        // ���� 2�� �Է� �ޱ�
        int num1, num2;
        
        System.out.println("���� 2 ���� ���������� �Է��ϼ���: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();            
        // ������� Ȯ���ϰ� ����ϱ�
        if ((num2 % num1) == 0) {
            System.out.printf("%d��(��) %d�� ����Դϴ�.", num1, num2);
        }
        else {
            System.out.printf("%d��(��) %d�� ����� �ƴմϴ�.", num1,num2);
        }
    }
}
