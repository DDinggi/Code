/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestNumber2 {
    public static void main(String[] args) {
        Number number = new Number();
        int sumInt = number.add(2, 3);
        System.out.printf("2 + 3 = %d\n", sumInt);
        float sumFloat = number.add(2.0f, 3.0f);
        System.out.printf("2 + 3 = %f\n", sumFloat);        
        double sumDouble = number.add(2.0, 3.0);
        System.out.printf("2 + 3 = %f\n", sumFloat);        
    }
}
