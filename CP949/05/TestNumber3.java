/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestNumber3 {
    public static void main(String[] args) {
        Number number = new Number();
        byte b1 = 2;
        byte b2 = 3;
        int sumInt = number.add(b1, b2);
        System.out.printf("2 + 3 = %d\n", sumInt);
        
        short s1 = 2000;
        int n2 = 3000;
        sumInt = number.add(s1, n2);
        System.out.printf("2 + 3 = %d\n", sumInt);
    }
}
