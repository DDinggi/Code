/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
