/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class RectangleCalcArea {
    private double height;
    private double width;
    private double area;
    
    RectangleCalcArea(double h, double w) {
        width = w;
        height = h;
        calcArea();
    }    
    double getArea() { return area; }    
    double getHeight() { return height; }    
    void setHeight(double h) {
        height = h;
        calcArea();
    }    
    double getWidth() { return width; }    
    void setWidth(double w) {
        width = w;
        calcArea();
    }    
    private void calcArea() { 
        area = width * height; 
    }
}
