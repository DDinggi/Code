/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class DBLoader implements ILoader {
    String dbName;
    
    public DBLoader(String dbfilename) { dbName = dbfilename; }    
    public String load() {
        return "reading data from the database called " + dbName;
    }
}
