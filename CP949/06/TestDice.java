/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
