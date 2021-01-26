/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Subway {
    int line;
    void run() { System.out.println(line + " line runs"); }
    void setLine(int l) { line = l; }
}

class TestSubway {
    public static void main(String[] args) {
        Subway mySub = new Subway();
        mySub.setLine(3);
        mySub.run();
    }
}
