/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class CmdLineArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}
