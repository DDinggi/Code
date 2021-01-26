/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
