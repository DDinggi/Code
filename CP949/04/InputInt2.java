/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class InputInt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("���� �� ���� �Է�. 0�� �ԷµǸ� ����˴ϴ�.");
            num = scanner.nextInt();
            // 0���� Ȯ���ϰ� ����ϰų� �ݺ� ����
            if (num != 0) 
                System.out.println(num);
            else
                break;
        } while (true);
    }
}
