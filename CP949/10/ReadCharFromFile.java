/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

class ReadCharFromFile {
    int readCharFromFile(String filename) 
               throws FileNotFoundException, IOException {
        FileReader f = new FileReader(filename);
        int ch = f.read();

        f.close();
        return ch;
    }
    
    public static void main(String[] args) {    
        ReadCharFromFile f = new ReadCharFromFile();
        try {
            int ch = f.readCharFromFile("test.txt");
            System.out.println((char) ch);
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found\n");
        }
        catch (IOException e) {
            System.out.println("i/o error\n");
        }
    }
}
