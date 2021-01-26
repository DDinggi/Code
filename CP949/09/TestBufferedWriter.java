/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.io.*;

class TestBufferedWriter {
    public static void main(String[] args) {
        String fileName = "travel.txt";

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName));
            bf.write("I love to travel.\r\n");
            bf.write("The cities I have visited:\r\n");
            bf.write("\t- Seoul\r\n");
            bf.write("\t- New York\r\n");
            bf.write("\t- Sydney\r\n");
            bf.close();    
            
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader();
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
