/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class StaticConvertChar {
    public static char toUpperCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('A' + (int) ch - (int) 'a');
        }
        return ch;           
    }
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) ('a' + (int) ch - (int) 'A');
        }
        return ch;           
    }
}
