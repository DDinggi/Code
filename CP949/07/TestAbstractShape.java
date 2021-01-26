/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestAbstractShape {
    public static void main(String[] args) {
        ARectangle r = new ARectangle(20.0, 10.0);
        ACircle c = new ACircle(10);
        System.out.printf("사각형의 면적: %.2f\n", r.getArea());
        System.out.printf("사각형의 둘레: %.2f\n", r.getPerimeter());
        System.out.printf("원의 면적: %.2f\n", c.getArea());
        System.out.printf("원의 둘레: %.2f\n", c.getPerimeter());
    }
}
