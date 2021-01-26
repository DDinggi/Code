/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class HelloFrench extends Hello {
    public HelloFrench(String toWhom) { super(toWhom); }    
    @Override
    public void sayHello() { System.out.println("Bonjour " + getWhom()); }
}

class HelloSpanish extends Hello {
    public HelloSpanish(String toWhom) { super(toWhom); }    
    @Override
    public void sayHello() {
        System.out.println("Hola a todos " + getWhom());
    }
}

class HelloKorean extends Hello {
    public HelloKorean(String toWhom) { super(toWhom); }    
    @Override
    public void sayHello() {
        System.out.println("안녕하세요 " + getWhom());
    }
}
