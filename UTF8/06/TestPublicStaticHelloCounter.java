/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class PublicHelloCounter {
    private String name;    
    public static int count = 0;
    
    PublicHelloCounter(String name) {
        this.name = name;
        PublicHelloCounter.count++; 
        /* this.count++도 사용 가능 */ 
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
