/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Date; // Date 클래스 사용

class Patient {
    private String id;
    private String name;

    public Patient(String name) {
        this.name = name;
        Date d = new Date();
        id = d.getTime() + name;
    }
    public String getName() { return name; }
    public String getID() { return id; }
    public String toString() {
        return "Patient: name: " + name + " id:  " + id;
    }
}
