/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class PublicHello {
    public String name;

    public PublicHello(String name) { this.name = name; }
    public void sayHello() { System.out.println("hello " + name); }
    
    public static void main(String args[]) {
        PublicHello h = new PublicHello("world");
        h.sayHello();
    }
}
