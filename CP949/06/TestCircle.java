/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Circle {
    static final double PI_VALUE = Math.PI; // ����� ���ÿ� �ʱⰪ�� �ο�
    double radius;
    
    Circle(double radius) { this.radius = radius; }    
    double calcArea() { return radius * radius * PI_VALUE; }    
    double calcPerimeter() { return 2 * radius * PI_VALUE; }
}
    
class TestCircle {
    public static void main(String[] args) {  
        Circle c = new Circle(5);
        System.out.printf("Area = %f\n", c.calcArea());
        System.out.printf("Perimeter = %f\n", c.calcPerimeter());
    }
}
