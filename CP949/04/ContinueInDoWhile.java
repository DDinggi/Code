/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class ContinueInDoWhile {
    public static void main(String[] args) {
        int i = 3;
        do {       
            System.out.printf("if�� ��: i = %d\n", i);      
            if (i < 7) {
                i += 2;
                System.out.printf("continue ���� ��: i = %d\n", i);
                continue;
                //System.out.printf("continue ���� �� �ڵ�: i = %d\n", i);
            }
            System.out.println("�̰� ��µǸ� �ȵ�!");
        } while (i < 7);
        System.out.printf("i = %d, �̰� ��µ�", i);
    }
}
