/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class StringPlus {
    public static void main(String[] args) {
        String s = "abc" + 3;
        System.out.println(s);
        s = "" + 3;
        System.out.println(s);
        s = 3.24 + "";
        System.out.println(s);
        s = 3.1415 + "�� PI ���̴�";
        System.out.println(s);
        String newStr = s + '.';
        System.out.println(newStr);
        boolean b = 3 > 2;
        String str = "3 > 2�� " + b + " �Դϴ�";
        System.out.println(str);
        System.out.println(2 + 3 + " = 23�ϱ�?");
        System.out.println("" + 2 + 3 + " = 23�ϱ�?");
    }
}
