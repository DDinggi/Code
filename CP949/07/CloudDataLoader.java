/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class CloudDataLoader implements ILoader {
    String url;
    
    public CloudDataLoader(String url) { this.url = url; }    
    public String load() { return "reading data from " + url; }
}
