/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class MethodBlockScopePriority {
    void printNumbers(int i) {
        int j = 5;
    
        if (true) {
            int k = 5;
            int i = 3;
            int j = 4; 
            System.out.printf("���ǹ� i = %d, j = %d, k = %d\n", i, j, k);
        }
    }
}
