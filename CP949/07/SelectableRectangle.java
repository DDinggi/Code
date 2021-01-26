/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class SelectableRectangle extends Rectangle {
    protected Point p1;
    protected boolean isSelected;
    
    public SelectableRectangle(Point p, double w, double h) {
        super(w, h);
        p1 = p;
        isSelected = false;
    }
    public void setSelected(boolean b) { isSelected = b; }        
    public boolean getSelected() { return isSelected; }
    public boolean isInside(Point p) {
        int x = p.getX();
        int y = p.getY();
        int x1 = p1.getX();
        int y1 = p1.getY();
        if (x1 <= x && x <= x1 + width && y1 <= y && y <= y1 + height) {
            return true;
        }
        return false;            
    }
}
