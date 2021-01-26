/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
