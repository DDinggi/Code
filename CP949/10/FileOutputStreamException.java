/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
            System.out.println("������ ���� ���� �� �� �����ϴ�");
        }        
        catch (IOException e) { e.printStackTrace(); }
    }
}
