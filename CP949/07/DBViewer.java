/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class DBViewer {
    ILoader loader;
    String data;
    
    DBViewer(ILoader loader) { this.loader = loader; }
    void setLoader(ILoader loader) { this.loader = loader; }
    void load() { data = loader.load(); }
    void show() { System.out.println(data); }
}
