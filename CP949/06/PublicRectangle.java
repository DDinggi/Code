/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class PublicRectangle {
    public double height;
    public double width;
    public double area;
    
    public PublicRectangle(double h, double w) {
        height = h;
        width = w;
        area = w * h;
    }    
    public double getArea() { return area; }    
    public double getHeight() { return height; }
    public void setHeight(double h) {
        height = h;
        area = width * height;
    }
    public double getWidth() { return width; }
    public void setWidth(double w) {
        width = w;
        area = width * height;
    }
}
