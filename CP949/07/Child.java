/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Child extends Parent {
    private int value;
    public Child(String n, int v) {
        super(n);  // 부모 생성자인 Parent(String n) 호출
        System.out.println("Child constructor");
        value = v;
    }
    public int getValue() { return value; }
    public void setValue(int v) { value = v; }
}
