/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
