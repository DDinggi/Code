/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
