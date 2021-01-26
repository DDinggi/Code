/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestCoffeeWithMilk {
    private String[][] allData;
    private String[][] copied;
    
    public TestCoffeeWithMilk(String[][] data) {
        allData = data;
        removeColumnHeaders();
    }   
    public int getCountOfAddingMilk() {
        int count = 0;
    
        for (String[] r : copied) {
            if (r[2].equals("Yes")) { count += 1; }
        }
        return count;
    }
    public double getPercentOfAddingMilk() {
        int count = getCountOfAddingMilk();
        return (float) 100 * count / copied.length;
    }    
    private void removeColumnHeaders() {
        copied = new String[allData.length - 1][allData[0].length];
        for (int i = 1; i < allData.length; i++) {
            for (int j = 0;j < allData[i].length; j++) {
                copied[i - 1][j] = allData[i][j];    
            }    
        }
    }
    
    public static void main(String[] args) {
        String[][] data = {
            { "Coffee", "Water", "Milk", "Icecream" },
            { "Espresso", "No", "No", "No" },
            { "Long Black", "Yes", "No", "No" },
            { "Flat White", "No", "Yes", "No" },
            { "Cappuccino", "No", "Yes", "No" },
            { "Affogato", "No", "No", "Yes" }
        };
        
        TestCoffeeWithMilk milkBeverages = new TestCoffeeWithMilk(data);
        System.out.printf("Number of Coffee adding Milk: %d\n", 
                      milkBeverages.getCountOfAddingMilk()); 
        System.out.printf("밀크를 넣는 커피 비율: %.1f\n",
                      milkBeverages.getPercentOfAddingMilk());
    }
}
