/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Selection {
    public void select(SelectableRectangle r, Point p) {
        if (r.isInside(p)) { // �簢�� ���ο� ���� ���ԵǴ��� Ȯ��
            r.setSelected(true); // ���õ� ������ ����
        }
        else { r.setSelected(false); } // ���õ��� ���� ������ ����
    }
}
