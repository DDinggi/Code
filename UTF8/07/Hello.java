/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
abstract class Hello {
    private String toWhom;
    
    public Hello(String whom) { toWhom = whom; }
    public String getWhom() { return toWhom; }    
    public abstract void sayHello();
}
