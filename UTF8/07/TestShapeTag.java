/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
