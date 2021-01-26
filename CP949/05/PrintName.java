/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class PrintName {
    String name;
    
    void setName(String nm) { name = nm; }
    void printName() { printString(name); }
    void printString(String str) { System.out.println(str); }
    
    public static void main(String[] args) {
        PrintName pn = new PrintName();
        pn.setName("Yongjoo Cho");
        pn.printName();
    }
}
