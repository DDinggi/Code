/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Hello {
    private String toWhom;
    public Hello(String whom) { this.toWhom = whom; }
    public void sayHello() { System.out.println("hello " + toWhom); }
    
    public static void main(String args[]) {
        Hello h1 = new Hello("world");
        h1.sayHello();
        Hello h2 = new Hello("new world")
        h2.sayHello();
    }
}
