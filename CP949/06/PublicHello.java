/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class PublicHello {
    public String name;

    public PublicHello(String name) { this.name = name; }
    public void sayHello() { System.out.println("hello " + name); }
    
    public static void main(String args[]) {
        PublicHello h = new PublicHello("world");
        h.sayHello();
    }
}
