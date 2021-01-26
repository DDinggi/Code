/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Random;

class DiceProbability {
    private int[] values;
    private int num;

    public DiceProbability(int num) {
        this.num = num;
        values = new int[6];
        for (int i = 0; i < 6; i++) {
            values[i] = 0;
        }
    }
    public void roll() {
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            values[random.nextInt(6)]++;
        }
    }
    public void printValues() {
        for (int i = 0; i < 6; i++) {
            System.out.printf("Counts of value %d: %d\n", i+1, values[i]);
        }
    }    
}
