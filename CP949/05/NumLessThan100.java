/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class NumLessThan100 {
    boolean isLessThan100(int num) {
        return (num < 100) ? true : false;
    }
    
    public static void main(String[] args) {
        NumLessThan100 numLessThan100 = new NumLessThan100();
        System.out.println(numLessThan100.isLessThan100(50));
        System.out.println(numLessThan100.isLessThan100(100));
        System.out.println(numLessThan100.isLessThan100(150));
    }
}
