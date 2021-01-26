/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestHello {
    public static void main(String[] args) {
        Hello[] hArray = new Hello[3];
        hArray[0] = new HelloFrench("js1");
        hArray[1] = new HelloSpanish("js2");
        hArray[2] = new HelloKorean("js3");
        for (Hello hello : hArray) { hello.sayHello(); }
    }
}
