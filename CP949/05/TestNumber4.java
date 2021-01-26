/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
