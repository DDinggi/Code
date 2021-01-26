/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
