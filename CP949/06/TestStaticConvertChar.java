/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
