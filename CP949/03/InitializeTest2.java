/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class InitializeTest2 {
    String s;
    
    void printString() { System.out.println(s); } // s의 값을 화면에 출력

    public static void main(String[] args) {    
        InitializeTest2 s = new InitializeTest2();
        s.printString();
    }
}
