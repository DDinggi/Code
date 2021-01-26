/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
private class PrivateHello {
    public String name;
    public PrivateHello(String name) { this.name = name; }
    public void sayHello() { System.out.println("hello " + name); }
}

public class PublicHello2 {   
    public static void main(String args[]) {
        PrivateHello h = new PrivateHello("world");
        h.sayHello();
    }
}
