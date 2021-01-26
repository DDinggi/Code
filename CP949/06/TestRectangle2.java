/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestRectangle2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 15);
        double area = rect.getArea();
        System.out.println("area = " + area);
        rect.width = 20;
        area = rect.getArea();
        System.out.println("new area = " + area);
    }
}
