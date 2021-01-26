/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
