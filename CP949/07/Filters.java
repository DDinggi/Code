/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class GrayFilter implements ImageFilter {
    public void apply(Image image) {
        System.out.println("ȸ���� ��ȯ ���� ����");
    }
}

class NoiseFilter implements ImageFilter {
    public void apply(Image image) {
        System.out.println("������ ���� ����");
    }
}
