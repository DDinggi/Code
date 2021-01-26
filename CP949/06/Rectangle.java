/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Rectangle {
    private double height;
    private double width;
    private double area;
    
    Rectangle(double h, double w) {
        height = h;
        width = w;
        area = w * h;
    }    
    double getArea() { return area; }    
    double getHeight() { return height; }
    void setHeight(double h) {
        height = h;
        area = width * height;
    }    
    double getWidth() { return width; }
    void setWidth(double w) {
        width = w;
        area = width * height;
    }
}
