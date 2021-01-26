/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Doctor {
    private int id;
    private String name; 

    public Doctor(int id, String name) {
       this.id = id;
       this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String toString() {
        return "Doctor: name: " + name + " id: " + id;
    }
}
