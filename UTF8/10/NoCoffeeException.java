/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class NoCoffeeException extends Exception{
    public NoCoffeeException(String e) {
        super(e);
    }
    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
