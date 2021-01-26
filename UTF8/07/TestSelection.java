/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestSelection {
    public static void main(String[] args) {
        Selection s = new Selection();
        SelectableRectangle r = new SelectableRectangle(
                                 new Point(100, 100), 30, 20);
        Point p1 = new Point(110, 110);
        s.select(r, p1);
        System.out.println(p1);
        System.out.printf("selected: %s\n", r.getSelected());

        Point p2 = new Point(150, 150);
        s.select(r, p2);  // 선택 안됨
        System.out.println(p2);
        System.out.printf("selected: %s\n", r.getSelected());
    }
}
