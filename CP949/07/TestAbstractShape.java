/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestAbstractShape {
    public static void main(String[] args) {
        ARectangle r = new ARectangle(20.0, 10.0);
        ACircle c = new ACircle(10);
        System.out.printf("�簢���� ����: %.2f\n", r.getArea());
        System.out.printf("�簢���� �ѷ�: %.2f\n", r.getPerimeter());
        System.out.printf("���� ����: %.2f\n", c.getArea());
        System.out.printf("���� �ѷ�: %.2f\n", c.getPerimeter());
    }
}
