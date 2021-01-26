/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class CoffeeMachineException {
    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine(15);

        try {
            coffee.brew();
            coffee.brew(); // 예외 발생
        }
        catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
