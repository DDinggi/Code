/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
