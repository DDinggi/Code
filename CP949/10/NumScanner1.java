/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NumScanner1 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("numbers.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("numbers.txt ������ �������� �ʽ��ϴ�.");
        }
        int n = sc.nextInt();

        System.out.println(n);
        sc.close();
    }
}
