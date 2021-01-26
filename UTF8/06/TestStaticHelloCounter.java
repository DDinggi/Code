/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
