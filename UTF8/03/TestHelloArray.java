/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Hello {
    String toWhom = "world";

    Hello() { }
    Hello(String whom) { setWhom(whom); }
    void setWhom(String whom) { toWhom = whom; }    
    void sayHello() { System.out.println("hello " + toWhom); }
}  

class TestHelloArray {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];
        helloArray[0] = new Hello();
        helloArray[1] = new Hello("홍길동");
        helloArray[2] = new Hello("허균");

        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}
