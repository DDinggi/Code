/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
