/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
private class PrivateHello {
    public String name;
    public PrivateHello(String name) { this.name = name; }
    public void sayHello() { System.out.println("hello " + name); }
}

public class PublicHello2 {   
    public static void main(String args[]) {
        PrivateHello h = new PrivateHello("world");
        h.sayHello();
    }
}
