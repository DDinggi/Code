/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
