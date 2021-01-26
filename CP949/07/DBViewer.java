/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class DBViewer {
    ILoader loader;
    String data;
    
    DBViewer(ILoader loader) { this.loader = loader; }
    void setLoader(ILoader loader) { this.loader = loader; }
    void load() { data = loader.load(); }
    void show() { System.out.println(data); }
}
