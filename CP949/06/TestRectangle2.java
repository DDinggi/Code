/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
