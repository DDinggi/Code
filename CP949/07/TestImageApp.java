/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class TestImageApp {    
    public static void main(String[] args) {
        ImageApp imageApp = new ImageApp();        
        Scanner scanner = new Scanner(System.in);
        boolean satisfied = false;
        
        do {
            System.out.print("���� �̸��� �Է��ϼ���: ");
            String filterName = scanner.next();
            System.out.println(filterName);
            if (filterName.compareTo("gray") == 0) {
                imageApp.apply(new GrayFilter());
            }
            else if (filterName.compareTo("noise") == 0) {
                imageApp.apply(new NoiseFilter());
            }
            System.out.print("���� ���� ����� �����մϱ�?: ");
            char yesOrNo = scanner.next().charAt(0);            
            if (yesOrNo == 'y') { satisfied = true; }
        } while (satisfied == false);
        System.out.println("���Ͱ� ����� �̹����� ����Ǿ����ϴ�.");
    }
}
