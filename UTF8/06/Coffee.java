/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Coffee {
    private String name; 
    private int price;
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public int getPrice() { return price; }
}
