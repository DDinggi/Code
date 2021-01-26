/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Scope {
    int num1 = 3;
    int num2 = 4;
    
    void printNumbers() {
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
    void printNumbers2() {
        int num1 = 5;  // Scope클래스의 멤버 변수인 num1과 같은 이름
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
    void printNumbers3(int num1) { // 클래스 멤버 변수인 num1과 같은 이름
        int num2 = 5;   // Scope 클래스의 멤버 변수인 num2와 같은 이름
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);        
    }
}

class TestScope {
    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.printNumbers();
        scope.printNumbers2();
        scope.printNumbers3(2);
    }
}
