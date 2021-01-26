/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class ContinueInWhile {
    public static void main(String[] args) {
        int i = 3;
        while (i < 7) {
            System.out.printf("if문 전: i = %d\n", i);             
            if (i < 7) {
                i += 2;
                System.out.printf("continue 실행 전: i = %d\n", i);
                continue;
                //System.out.printf("continue 실행 후 코드: i = %d\n", i);
            }
            System.out.println("이건 출력되면 안됨!");
        }
        System.out.printf("i = %d, 이건 출력됨", i);
    }
}
