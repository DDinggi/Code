/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Circle {
    static final double PI_VALUE = Math.PI; // 선언과 동시에 초기값을 부여
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
