/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class FileLoader implements ILoader {
    String fileName;
    
    public FileLoader(String filename) { fileName = filename; }
    public String load() { return "reading data from " + fileName; };
}
