/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.FileReader;

public class FileReaderException {
    public static void main(String[] args) {
        FileReader fr = new FileReader("noname.txt");

        fr.close();
    }
}
