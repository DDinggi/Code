/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class MovieTicketPriceWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("���� Ƽ�� ����: prime, standard, �Ǵ� economy �� �� ������ �Է��ϼ���: ");
        String zone = scanner.next();        
        switch (zone) { // �ڹ� 7���� ���ڿ� ��� ����
            case "prime": // prime�� ��ġ�ϸ�
                System.out.println("�������� ǥ ���� 11000���Դϴ�.");
                break;
            case "standard": // standard�� ��ġ�ϸ�
                System.out.println("���Ĵٵ��� ǥ ���� 10000���Դϴ�.");
                break;
            
            case "economy": // economy�� ��ġ�ϸ�
                System.out.println("���ڳ���� ǥ ���� 9000���Դϴ�.");
                break;
            
            default: // prime, standard, economy�� �ƴϸ�
                System.out.println("�¼� ������ �߸� �Է��߽��ϴ�.");
                break;
        }
    }
}
