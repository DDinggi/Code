/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class FileLoader implements ILoader {
    String fileName;
    
    public FileLoader(String filename) { fileName = filename; }
    public String load() { return "reading data from " + fileName; };
}
