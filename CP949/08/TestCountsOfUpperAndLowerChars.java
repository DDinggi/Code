/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Map;

class TestCountsOfUpperAndLowerChars {
    public static void main(String[] args) {
        String str = "hello123with456 HELLO";
        CountsOfUpperAndLowerChars culcs = new CountsOfUpperAndLowerChars(str);
        Map<String, Integer> wc = culcs.getCountsOfUpperAndLowerChars();
        System.out.println(wc);
    }
}
