/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class ARectangle extends AbstractShape {
    private double width, height;

    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }    
    @Override
    public double getArea() { return width * height; }    
    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

class ACircle extends AbstractShape {
   private double radius;

   public ACircle(double radius) { this.radius = radius; }    
   @Override
   public double getArea() { return Math.PI * radius * radius; }    
   @Override
   public double getPerimeter() { return 2 * Math.PI * radius; }
}
