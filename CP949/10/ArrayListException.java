/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.ArrayList;

public class ArrayListException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = -1; i < 4; i++) {
            try {
                int n = list.get(i);

                System.out.printf("list[%d] = %d\n", i, n);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.printf("�ε��� %d�� ������ ������ϴ�.\n", i);
            }
        }
    }
}
