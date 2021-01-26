/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.FileReader;
import java.io.BufferedReader;

public class LowerCaseConversion {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("hello.txt");
            BufferedReader f = new BufferedReader(fr);
            int data;
        
            while ((data = f.read()) != -1) { 
                char ch = Character.toLowerCase((char) data);
                System.out.print(ch); 
            }
            f.close();        
        }
        catch (Exception e) {  e.printStackTrace(); }
    }
}
