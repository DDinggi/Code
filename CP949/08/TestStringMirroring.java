/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class TestStringMirroring {
    String mirror1(String hello) { // ��� 1
        StringBuilder olleh = new StringBuilder();
        for (int i = hello.length() - 1; i >= 0; i--) {
            olleh.append(hello.charAt(i));
        }
        return olleh.toString();
    }
    String mirror2(String hello) { // ��� 2
        char[] chArr = hello.toCharArray();
        StringBuilder olleh = new StringBuilder();
        for (int i = chArr.length - 1; i >= 0; i--)
            olleh.append(chArr[i]);
        return olleh.toString();
    }
    
    public static void main(String[] args) {
        TestStringMirroring t = new TestStringMirroring();
        System.out.println(t.mirror1("sangmyung"));
        System.out.println(t.mirror2("university"));
    }
}
