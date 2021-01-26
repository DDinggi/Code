/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestRectangleImpl {
    public static void main(String[] args) {
        IShape r = new RectangleImpl(10., 20.);

        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}
