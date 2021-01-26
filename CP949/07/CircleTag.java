/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class CircleTag extends ShapeTag {
    private String circleTag;
    
    public CircleTag(String tag, String circleTag) {
        super(tag);
        this.circleTag = circleTag;
    }
    
    public String getCircleTag() { return circleTag; }    
    @Override
    public String toString() {
        return "#" + circleTag + " " + super.toString();
    }
}
