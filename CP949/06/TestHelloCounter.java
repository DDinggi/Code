/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestHelloCounter {
    public static void main(String[] args) {    
        HelloCounter counter = new HelloCounter();
        Hello2 h1 = new Hello2("world", counter);
        System.out.println("count: " + h1.getCount());
        Hello2 h2 = new Hello2("new world", counter);
        System.out.println("count 1: " + h1.getCount());
        System.out.println("count 2: " + h2.getCount());
        h1.sayHello();
        h2.sayHello();
    }
}
