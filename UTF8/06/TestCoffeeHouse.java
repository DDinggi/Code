/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.time.LocalDateTime;

class TestCoffeeHouse {
    public static void main(String[] args) {
        CoffeeHouse ch = new CoffeeHouse("SMUCoffee", "02-1111-1111", 
"Jongnogu 111, Seoul");
        Customer v = new Customer("js", "010-2222-2222");
        Coffee c = new Coffee("americano", 5000);
        Order o = new Order();
       
        for (int i = 0; i < 12; i++) { // 11번 주문
            o.takeOrder(v, c);
        }
        ch.addOrder(o);
        o.charge();
    }
}
