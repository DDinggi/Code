/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
interface SimpleActionInterface {
    void doAction();
}

class TestPrintAction2 {
    public void runAction(SimpleActionInterface ai) { ai.doAction(); }    
    public static void main(String[] args) {
        TestPrintAction2 tpa = new TestPrintAction2();
        tpa.runAction(new SimpleActionInterface() {
            @Override
            public void doAction() { System.out.println("Print Action"); }
        });
    }
}
