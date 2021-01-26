/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.*;
import java.io.*;

public class NumScanner4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("numbers.txt"))) {
            int n = sc.nextInt();

            System.out.println(n);
        }
        catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("파일이 존재하지 않거나 데이터가 정수값이 아니거나, 데이터가 없습니다");
        }
    }
}
