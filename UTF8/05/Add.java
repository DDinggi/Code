/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Add { 
    String add(String s1, String s2) {
        return s1 + ' ' + s2; // 중간에 공백 문자 삽입
    }
    int add(int n1, int n2) { return n1 + n2; }
    double add(double d1, double d2) { return d1 + d2; }

    public static void main(String[] args) {
        Add a = new Add();
        String newStr = a.add("hello", "world");
        int sumInt = a.add(5, 3);
        double sumDouble = a.add(5.1, 3.5);
        System.out.printf("newStr = %s\n", newStr);
        System.out.printf("sumInt = %d\n", sumInt);
        System.out.printf("sumInt = %f\n", sumDouble);
    }
}
