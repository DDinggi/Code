/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class BlockScopePriority {
    int j = 5;
    int i = 4;
    
    void printNumbers(int i) {
        if (true) {
            int k = 5;
            int j = 4; 
            System.out.printf("���ǹ� i = %d, j = %d, k = %d\n", i, j, k);
        }
        System.out.printf("�޼ҵ� i = %d, j = %d\n", i, j);
    }
    
    public static void main(String[] args) {
        BlockScopePriority block = new BlockScopePriority();
        block.printNumbers(3);
    }
}
