/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("prime,standard,economy�� �� ������ �Է��Ͻÿ�: ");
        String zone = scanner.next();

        if (zone.compareTo("prime") == 0) { // prime�� ��ġ�ϸ�
            System.out.println("�������� ǥ ���� 11000���Դϴ�.");
        } 
        else if (zone.compareTo("standard") == 0) { // standard�� ��ġ�ϸ�
            System.out.println("���Ĵٵ��� ǥ ���� 10000���Դϴ�.");
        }
        else if (zone.compareTo("economy") == 0) { // economy�� ��ġ�ϸ�
            System.out.println("���ڳ���� ǥ ���� 9000���Դϴ�.");
        }
        else { // prime, standard, economy�� �ƴϸ�
            System.out.println("�¼� ������ �߸� �Է��߽��ϴ�.");
        }
    }
}
