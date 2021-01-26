/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
