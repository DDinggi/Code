/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class CoffeeMachine {
    private int amountOfCoffeeBeans;
    
    public CoffeeMachine(int beans) { amountOfCoffeeBeans = beans; }    
    public int getAmountOfCoffeeBeans() { return amountOfCoffeeBeans; }
    public void addCoffeeBeans(int beans) {
        amountOfCoffeeBeans += beans;
    }
    public void brew() throws NoCoffeeException {
        if (amountOfCoffeeBeans < 10) {
            throw new NoCoffeeException("No Coffee Exception...");
        }        
        System.out.println("Brewing...");
        amountOfCoffeeBeans -= 10;
    }
}
