/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestRectangle3 {
    public static void main(String[] args) {
        RectangleCalcArea rect = new RectangleCalcArea (10, 15);
        double area = rect.getArea();
        System.out.println("면적 = " + area);
        // rect.calcArea();
    }
}
