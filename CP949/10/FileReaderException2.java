/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.io.FileReader;

public class FileReaderException2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("noname.txt");

            fr.close();
        }
        catch (Exception e) {
            System.out.println("noname.txt ������ �������� �ʽ��ϴ�.");
        }
    }
}
