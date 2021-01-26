/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
public class Cup1Cup2DoWhile {
    public static void main(String[] args) {
        int Cup1 = 10;
        int Cup2 = 50;

        do {
            Cup1 += 10;
        } while (Cup1 < Cup2);
        
        System.out.println("Cup1 = " + Cup1);
        System.out.println("Cup2 = " + Cup2);          
    }
}
