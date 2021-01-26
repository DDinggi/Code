/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class TestGetClass {    
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        System.out.println("c의 클래스는: " + c.getClass());
        
        Arabica a = new Arabica();
        System.out.println("a의 클래스는: " + a.getClass());
        
        Robusta r = new Robusta();
        System.out.println("r의 클래스는: " + r.getClass());
    }
}
