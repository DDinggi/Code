/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestRectangleImpl {
    public static void main(String[] args) {
        IShape r = new RectangleImpl(10., 20.);

        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}
