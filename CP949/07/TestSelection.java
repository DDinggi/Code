/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
        s.select(r, p2);  // ���� �ȵ�
        System.out.println(p2);
        System.out.printf("selected: %s\n", r.getSelected());
    }
}
