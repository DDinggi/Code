/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.time.LocalDateTime;

class TestCoffeeHouse {
    public static void main(String[] args) {
        CoffeeHouse ch = new CoffeeHouse("SMUCoffee", "02-1111-1111", 
"Jongnogu 111, Seoul");
        Customer v = new Customer("js", "010-2222-2222");
        Coffee c = new Coffee("americano", 5000);
        Order o = new Order();
       
        for (int i = 0; i < 11; i++) { // 11�� �ֹ�
            o.takeOrder(v, c);
        }
        ch.addOrder(o);
        o.charge();
    }
}
