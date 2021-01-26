/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileException {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("noname.txt");

            fr.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("noname.txt 파일이 존재하지 않습니다");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("파일을 닫으면서 오류가 발생했습니다");
            e.printStackTrace();
        }        
    }
}
