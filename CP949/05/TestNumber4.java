/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestNumber4 {
    float add(float a, float b) {
        System.out.println("float add(float a, float b)");
        return a + b;
    }
    
    double add(double a, double b) {
        System.out.println("double add(double a, double b)");
        return a + b;    
    }

    public static void main(String[] args) {
        TestNumber4 number = new TestNumber4();
        byte b1 = 2;
        byte b2 = 3;
        float sumFloat = number.add(b1, b2);
        System.out.printf("2 + 3 = %f\n", sumFloat);
        
        short s1 = 2000;
        int n2 = 3000;
        double sumDouble = number.add(s1, n2);
        System.out.printf("2 + 3 = %f\n", sumDouble);
    }
}
