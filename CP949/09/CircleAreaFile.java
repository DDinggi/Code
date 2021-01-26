/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CircleAreaFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("circle.txt"));
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            System.out.printf("반지름: %.2f 원의 면적:%.2f\n", r, area);
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("circle.txt 파일이 존재하지 않습니다.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
