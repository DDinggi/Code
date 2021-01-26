/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class StaticHelloCounter {
    private String name;    
    private static int count = 0;
    
    StaticHelloCounter(String name) {
        this.name = name;
        count++;
    }
    void sayHello() { System.out.println("hello " + name); }
    int getCount() { return count; }
}

class TestStaticHelloCounter {
    public static void main(String[] args) {    
        StaticHelloCounter h1 = new StaticHelloCounter("world");
        System.out.println("count: " + h1.getCount());
        StaticHelloCounter h2 = new StaticHelloCounter("new world");
        System.out.println("count 1: " + h1.getCount());
        System.out.println("count 2: " + h2.getCount());
        h1.sayHello();
        h2.sayHello();
    }
}
