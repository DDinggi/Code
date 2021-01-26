/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
