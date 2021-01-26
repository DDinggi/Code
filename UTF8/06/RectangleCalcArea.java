/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
