/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Random;

class Dice {
    private Random random;

    public Dice(Random random) { this.random = random; }
    public int roll() { return random.nextInt(6) + 1; }
}

public class TestDice {
    public static void main(String[] args) {
        Random random = new Random();
        Dice dice1 = new Dice(random);
        dice1.roll();
        Dice dice2 = new Dice(random);
        dice2.roll();
    }
}
