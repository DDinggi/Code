/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class InputInt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.printf("���� �� ���� �Է�. 0�� �ԷµǸ� ����˴ϴ�.");
            num = scanner.nextInt();
            System.out.println(num);
        } while (num != 0);
    }
}
