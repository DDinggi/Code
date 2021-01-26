/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
interface SimpleActionInterface {
    void doAction();
}

class TestPrintAction {
    public static void main(String[] args) {
        SimpleActionInterface p = new SimpleActionInterface() {
            @Override
            public void doAction() { System.out.println("Print Action"); }
        };
        p.doAction();
    }
}
