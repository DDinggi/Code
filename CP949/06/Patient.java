/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.Date; // Date Ŭ���� ���

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
