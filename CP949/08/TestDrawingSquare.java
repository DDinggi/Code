/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class TestDrawingSquare {
    public void drawSquareFrom(Coordinate[] tracks) {
        for (Coordinate t : tracks) {
            System.out.printf("(%f, %f)\n", t.x, t.y);
        }
    }

    public static void main(String[] args) {
        TestDrawingSquare drawingSquare = new TestDrawingSquare();
        Coordinate[] tracks = new Coordinate[2];
        tracks[0] = new Coordinate(100, 100);
        tracks[1] = new Coordinate(200, 200);
        drawingSquare.drawSquareFrom(tracks);
    }
}
