/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class Output10_59_4 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i+=10) {
            int j = 0;            
            while (j <= 9) {
                System.out.print(i + j);
                System.out.print(" ");
                j++;
            }
        }
    }
}
