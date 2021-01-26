/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] a = new int[3];

        System.out.print(a[3]); // 인덱스 3은 실제 4번째 요소
    }
}
