/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
