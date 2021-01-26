/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class CircleHasAPoint {
    private Point center;
    private double radius;

    public CircleHasAPoint() {}
    public CircleHasAPoint(Point p, double r) {
        center = p;
        this.radius = r;
    }
    public CircleHasAPoint(int x, int y, double r) {
        center = new Point(x, y);
        this.radius = r;
    }
    public double getRadius() { return radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }
}
