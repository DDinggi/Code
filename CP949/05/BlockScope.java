/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class BlockScope {
    public static void main(String[] args) {
        if (true) {
            int i = 3;
            int j = 4; // �� ������ ����� ��� ����
            System.out.printf("���ǹ� i = %d\n", i);
        }
            
        for (int n = 0; n < 3; n++) {
            int i = 4;
            int k = 5; // �� ������ ����� ��� ����
            System.out.printf("�ݺ��� i = %d\n", i);
        }

        {  // ���ο� �ڵ� ��� ����
            int i = 5;
            System.out.printf("���ο� �ڵ� ��� i = %d\n", i);
        }  // ���ο� �ڵ� ��� ��
        //System.out.printf("i = %d, j = %d\n", i, j); // ���� �߻�
    }
}
