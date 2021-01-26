/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestProctedMember {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(20.0, 10.0);
        System.out.println(myRect.getHeight()); // 10.0 출력
        Pyramid p = new Pyramid();
        p.printHeight(); // Rectangle height: 10.0 출력
    }
}
