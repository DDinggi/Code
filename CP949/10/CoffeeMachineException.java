/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class CoffeeMachineException {
    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine(15);

        try {
            coffee.brew();
            coffee.brew(); // ���� �߻�
        }
        catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
