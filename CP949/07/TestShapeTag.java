/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class TestShapeTag {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        ShapeTag s2 = new ShapeTag("shape2");
        RectangleTag r = new RectangleTag("shape", "rectangle");
        CircleTag c = new CircleTag("shape", "circle");

        System.out.println("Shape1 Tag: " + s1);
        System.out.println("Shape1 Tag: " + s2);
        System.out.println("Rectangle Tags: " + r);
        System.out.println("Circle Tags: " + c);

        s1 = r;
        s2 = c;
        System.out.println("Rectangle Tags: " + s1);
        System.out.println("Circle Tags: " + s2);
    }
}
