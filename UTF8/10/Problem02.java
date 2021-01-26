/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Problem02 {
    public static void main(String[] args) {
        int[] arr = { 90, 80, 65, 98, 89, 87 };
        double sum = 0;
        
        for (int i = 0; i <= arr.length; i++) {
            sum += arr[i];        
        }
        System.out.printf("Average = %f\n", sum / arr.length);
    }
}  
