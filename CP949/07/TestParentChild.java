/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class TestParentChild {
    void showNameAndValue(Parent base) {
        System.out.println(base.getName());    
        System.out.println(base.getValue());
    }

    public static void main(String[] args) {
        TestParentChild tpc = new TestParentChild();
        Child derived = new Child("child", 0);
        tpc.showNameAndValue(derived);
    }
}
