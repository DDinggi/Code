/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestStaticConvertChar {
    public static void main(String[] args) {        
        System.out.println(StaticConvertChar.toUpperCase('c'));
        System.out.println(StaticConvertChar.toLowerCase('C'));
        StaticConvertChar c1 = new StaticConvertChar();
        System.out.println(c1.toUpperCase('h'));
        System.out.println(c1.toLowerCase('H'));
    }
}
