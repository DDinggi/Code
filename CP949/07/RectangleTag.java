/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class RectangleTag extends ShapeTag {
    private String rectangleTag;

    public RectangleTag(String tag, String rectangleTag) {
        super(tag);
        this.rectangleTag = rectangleTag;
    }    
    public String getRectangleTag() { return rectangleTag; }    
    @Override
    public String toString() {
        return "#" + rectangleTag + " " + super.toString();
    }
}
