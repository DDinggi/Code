/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class ClassCastException {
    public static void main(String[] args) {
        Object o = new Integer(1);
        String s = (String) o;

        System.out.println(s);
    }
}
