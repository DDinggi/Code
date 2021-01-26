/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
