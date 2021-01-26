/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Parent {
    private String name;
    public Parent(String n) {
        System.out.println("Parent constructor");
        name = n;
    }
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}
