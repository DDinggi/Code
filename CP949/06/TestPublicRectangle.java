/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestPublicRectangle {
    public static void main(String[] args) {   
        PublicRectangle r = new PublicRectangle(10, 20);
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
        r.setHeight(20);
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
        r.height = 10;
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
    }
}
