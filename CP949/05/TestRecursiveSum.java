/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestRecursiveSum {
    long sum(int n) {
        if (n == 1) { return 1; }
        else { return n + sum(n - 1); }
    }
    
    public static void main(String[] args) {
        TestRecursiveSum sum = new TestRecursiveSum();
        System.out.println(sum.sum(100));
    }
}
