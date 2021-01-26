/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
