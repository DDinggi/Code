/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class Output10_59_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // i가 1, 2, 3, 4, 5일 때 다음 반복문이 실행됨
            for (int j = 0; j <= 9; j++) {
                System.out.print("" + i + j);
                System.out.print(" ");
            }
        }
    }
}
