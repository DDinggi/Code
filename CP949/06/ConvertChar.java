/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class ConvertChar {
    char toUpperCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('A' + (int) ch - (int) 'a');
        }
        return ch;           
    }   
    char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return (char) ('a' + (int) ch - (int) 'A');
        return ch;           
    }
    
    public static void main(String[] args) {
        ConvertChar c1 = new ConvertChar();
        System.out.println(c1.toUpperCase('c'));
        System.out.println(c1.toLowerCase('C'));
        ConvertChar c2 = new ConvertChar();
        System.out.println(c2.toUpperCase('h'));
        System.out.println(c2.toLowerCase('H'));
    }
}
