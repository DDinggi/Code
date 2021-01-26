/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestRecursiveSum {
    long sum(int n) {
        if (n == 1) { return 1; }
        else { return n + sum(n - 1); }
    }
    
    public static void main(String[] args) {
        TestRecursiveSum sum = new TestRecursiveSum();
        System.out.println(sum.sum(100));
    }
}
