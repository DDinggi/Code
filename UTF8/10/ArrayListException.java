/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.ArrayList;

public class ArrayListException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = -1; i < 4; i++) {
            try {
                int n = list.get(i);

                System.out.printf("list[%d] = %d\n", i, n);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.printf("인덱스 %d가 범위를 벗어났습니다.\n", i);
            }
        }
    }
}
