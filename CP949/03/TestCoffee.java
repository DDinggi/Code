/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Coffee {
    String origin;
    int degreeOfRoast;
    int grade;

    Coffee(String o) { origin = o; }
    public void roast() { System.out.println("roasting..." + origin); }
    public void grind() { System.out.println("grinding..." + origin); }
    public void brew() { System.out.println("brewing..." + origin); }
}

class TestCoffee {
    public static void main(String[] args) {
        Coffee brazilCoffee = new Coffee("Brazil");
        brazilCoffee.roast();
        brazilCoffee.grind();
        brazilCoffee.brew();        
    }
}
