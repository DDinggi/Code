/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10, 10, 5);
        double myArea = myCircle.getArea();
        double myCircumference = myCircle.getCircumference();

        System.out.printf("�� ����: %.2f\n", myArea); 
        System.out.printf("�� �ѷ�: %.2f\n", myCircumference);
    }
}
