/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
            System.out.println("noname.txt ������ �������� �ʽ��ϴ�");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("������ �����鼭 ������ �߻��߽��ϴ�");
            e.printStackTrace();
        }        
    }
}
