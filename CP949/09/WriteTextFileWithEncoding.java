/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.io.*;

class WriteTextFileWithEncoding {
    void writeTextFile(String fileName, String charSet) {
        try {
            FileOutputStream fs = new FileOutputStream(fileName);
            OutputStreamWriter osr = new OutputStreamWriter(fs, charSet);
            BufferedWriter bf = new BufferedWriter(osr);

            bf.write("�ȳ��ϼ���.\r\n");
            bf.write("���ο� ������ ����Ǿ����ϴ�.\r\n");
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
