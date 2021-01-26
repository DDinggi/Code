/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class PublicHelloCounter {
    private String name;    
    public static int count = 0;
    
    PublicHelloCounter(String name) {
        this.name = name;
        PublicHelloCounter.count++; 
        /* this.count++�� ��� ���� */ 
    }
    void sayHello() { System.out.println("hello " + name); }
}

class TestPublicStaticHelloCounter {
    public static void main(String[] args) {    
        PublicHelloCounter h1 = new PublicHelloCounter("world");
        System.out.println("count: " + h1.count);
        PublicHelloCounter h2 = new PublicHelloCounter("new world");
        System.out.println("count 1: " + PublicHelloCounter.count); 
        System.out.println("count 2: " + h2.count);
    }
}
