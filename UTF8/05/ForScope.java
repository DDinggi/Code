/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class ForScope {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 5; i++, j++) {
            System.out.printf("i = %d, j = %d\n", i, j);
        }
        // System.out.printf("i = %d, j = %d\n", i, j); // 오류 발생
    }
}
