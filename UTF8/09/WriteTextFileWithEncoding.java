/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.*;

class WriteTextFileWithEncoding {
    void writeTextFile(String fileName, String charSet) {
        try {
            FileOutputStream fs = new FileOutputStream(fileName);
            OutputStreamWriter osr = new OutputStreamWriter(fs, charSet);
            BufferedWriter bf = new BufferedWriter(osr);

            bf.write("안녕하세요.\r\n");
            bf.write("새로운 내용이 저장되었습니다.\r\n");
            bf.write("English doesn't matter with encoding scheme.\r\n");
            bf.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }

    public static void main(String[] args) {
        WriteTextFileWithEncoding wf = new WriteTextFileWithEncoding();        
        System.out.println("Write ANSI file");
        wf.writeTextFile("NewHelloANSI.txt", "CP949");
        System.out.println("Write UTF-8 file");
        wf.writeTextFile("NewHelloANSI.txt", "UTF8");
    }
}
