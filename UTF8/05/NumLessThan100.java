/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class NumLessThan100 {
    boolean isLessThan100(int num) {
        return (num < 100) ? true : false;
    }
    
    public static void main(String[] args) {
        NumLessThan100 numLessThan100 = new NumLessThan100();
        System.out.println(numLessThan100.isLessThan100(50));
        System.out.println(numLessThan100.isLessThan100(100));
        System.out.println(numLessThan100.isLessThan100(150));
    }
}
