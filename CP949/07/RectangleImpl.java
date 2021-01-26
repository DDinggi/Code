/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class RectangleImpl implements IShape {
    private double width, height;
    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
