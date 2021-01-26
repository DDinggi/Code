/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Array6 {
    public static void main(String[] args) {
        double arr[] = { 1.1, 2.3, 4.7, 7.5 };
            
        System.out.printf("배열 크기: %d\n", arr.length);
        for (int index = 0; index < arr.length; index++) {
             System.out.printf("arr[%d] = %f\n", index, arr[index]);
        }
    }
}
