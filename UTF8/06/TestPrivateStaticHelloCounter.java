/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class PrivateCounterHello {
    private String name;    
    private static int count = 0;
    
    PrivateCounterHello(String name) {
        this.name = name;
        count++;
    }
    void sayHello() { System.out.println("hello " + name); }
    public static int getCount() { return count; }
}

class TestPrivateStaticHelloCounter {
    public static void main(String[] args) {    
        System.out.println("count: " + PrivateCounterHello.getCount());
        PrivateCounterHello h1 = new PrivateCounterHello("world");
        System.out.println("count: " + PrivateCounterHello.getCount());
        PrivateCounterHello h2 = new PrivateCounterHello("new world");
        System.out.println("count 1: " + h1.getCount());
        System.out.println("count 2: " + h2.getCount());
    }
}
