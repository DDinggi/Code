/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Hello2 {
    private String toWhom;    
    private HelloCounter counter;
    
    public Hello2(String whom, HelloCounter counter) {
        this.toWhom = whom;
        this.counter = counter;
        counter.increase();
    }
    public void sayHello() { System.out.println("hello " + toWhom); }
    public int getCount() { return counter.getCount(); }
}
