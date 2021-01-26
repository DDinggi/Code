/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.*;
import java.io.*;

public class NumScanner2 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("numbers.txt"));
            int n = sc.nextInt();
            System.out.println(n);
        }
        catch (FileNotFoundException e) {
            System.out.println("numbers.txt ������ �������� �ʽ��ϴ�.");
        }
        catch (InputMismatchException e) {
            System.out.println("���� �����Ͱ� �������� �ƴմϴ�");
        }
        catch (NoSuchElementException e) {
            System.out.println("���� �����Ͱ� �����ϴ�");
        }
        finally {
            if (sc != null) {
                System.out.println("finally ��Ͽ��� Scanner�� �ݽ��ϴ�");
                sc.close();            
            }
        }
    }
}
