/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Hello {
    void sayHello() { System.out.println("hello"); }
}

public class HelloTest2 {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.sayHello();
        Hello h2 = new Hello();
        h2.sayHello();
    }
}
