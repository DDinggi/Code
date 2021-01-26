/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
