/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CircleAreaFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("circle.txt"));
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("������: %.2f ���� ����:%.2f\n", r, area);
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("circle.txt ������ �������� �ʽ��ϴ�.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
