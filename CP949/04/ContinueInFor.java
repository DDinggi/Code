/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class ContinueInFor {
    public static void main(String[] args) {
        int i;
        for (i = 3; i < 7; i++) {
            System.out.printf("if�� ��: i = %d\n", i);      
            if (i < 7) {
                i += 2;
                System.out.printf("continue ���� ��: i = %d\n", i);
                continue;
                //System.out.printf("continue ���� �� �ڵ�: i = %d\n", i);
            }
            System.out.println("�̰� ��µǸ� �ȵ�!");
        }
        System.out.printf("i = %d, �̰� ��µ�", i);
    }
}
