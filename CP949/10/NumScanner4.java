/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.*;
import java.io.*;

public class NumScanner4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("numbers.txt"))) {
            int n = sc.nextInt();

            System.out.println(n);
        }
        catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("������ �������� �ʰų� �����Ͱ� �������� �ƴϰų�, �����Ͱ� �����ϴ�");
        }
    }
}
