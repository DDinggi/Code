/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;

public class InputWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("�ܾ� �Է�. quit�� �Է��ϸ� �����: ");
        word = scanner.next();
        while (!word.equals("quit")) {
            System.out.println(word);
            System.out.print("�ܾ� �Է�. quit�� �Է��ϸ� �����: ");
            word = scanner.next();
        }
    }
}
