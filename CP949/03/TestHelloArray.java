/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Hello {
    String toWhom = "world";

    Hello() { }
    Hello(String whom) { setWhom(whom); }
    void setWhom(String whom) { toWhom = whom; }    
    void sayHello() { System.out.println("hello " + toWhom); }
}  

class TestHelloArray {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];
        helloArray[0] = new Hello();
        helloArray[1] = new Hello("ȫ�浿");
        helloArray[2] = new Hello("���");

        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}
