/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Scanner;
import java.io.File;

public class ReadHelloFile {
    public static void main(String[] args) {
        try {        
            Scanner sc = new Scanner(new File("hello.txt"));
            while (sc.hasNext()) { // ���Ͽ� �����Ͱ� ���Ҵ��� Ȯ��
                String line = sc.nextLine(); 
                System.out.println(line);
            }
            sc.close();    
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}
