/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class ShapeTag {
    private String tag;
    
    public ShapeTag(String tag) { this.tag = tag; } 
    public String getShapeTag() { return tag; }
    @Override
    public String toString() { return "#" + tag; }
}
