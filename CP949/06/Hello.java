/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Hello {
    private String toWhom;
    public Hello(String whom) { this.toWhom = whom; }
    public void sayHello() { System.out.println("hello " + toWhom); }
    
    public static void main(String args[]) {
        Hello h1 = new Hello("world");
        h1.sayHello();
        Hello h2 = new Hello("new world")
        h2.sayHello();
    }
}
