/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
