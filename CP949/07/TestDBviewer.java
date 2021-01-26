/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestDBViewer {
    public static void main(String[] args) {
        DBViewer viewer = new DBViewer(new FileLoader("data.txt"));
        viewer.load();
        viewer.show();
        viewer.setLoader(new DBLoader("data.db"));
        viewer.load();
        viewer.show();
        viewer.setLoader(new CloudDataLoader("https://cloud.db/data.db"));
        viewer.load();
        viewer.show();
    }
}
