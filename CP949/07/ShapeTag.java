/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class ShapeTag {
    private String tag;
    
    public ShapeTag(String tag) { this.tag = tag; } 
    public String getShapeTag() { return tag; }
    @Override
    public String toString() { return "#" + tag; }
}
