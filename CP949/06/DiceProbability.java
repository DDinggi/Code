/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
