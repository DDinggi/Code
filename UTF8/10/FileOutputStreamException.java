/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.*;

class FileOutputStreamException {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("noname.txt");

            f.write((byte) 't');
            f.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("파일을 쓰기 위해 열 수 없습니다");
        }        
        catch (IOException e) { e.printStackTrace(); }
    }
}
