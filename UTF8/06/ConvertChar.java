/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
