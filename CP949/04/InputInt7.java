/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class InputInt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("0�� �ƴ� ���� �� ���� �Է��ϼ���. 100�̻��� ������ �ԷµǸ� ����˴ϴ�.");
            num = scanner.nextInt();
            if (num == 0) {
                continue;
            }
            else {
                System.out.println(num);               
            }
        } while (num < 100);
    }
}
