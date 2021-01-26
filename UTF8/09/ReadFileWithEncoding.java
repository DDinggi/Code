/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.*;

class ReadFileWithEncoding {
    public void readAndPrintFile(String fileName, String charSet) {
        try {       
            FileInputStream fs = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fs, charSet);
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }        
            br.close();
        }
        catch (Exception e) { e.printStackTrace(); }
    }
    
    public static void main(String[] args) {
        ReadFileWithEncoding rf = new ReadFileWithEncoding();
        System.out.println("Reading ANSI text file");
        rf.readAndPrintFile("HelloANSI.txt", "CP949");
        System.out.println("Reading UTF8 text file");
        rf.readAndPrintFile("HelloUTF8.txt", "UTF8");
    }
}
