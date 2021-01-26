/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
