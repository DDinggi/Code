/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Student {
    private String stNo;
    private String name;

    public Student(String stNo, String name) {
        this.stNo = stNo;
        this.name = name;
    }
    public String getStNo() { return stNo; }
    public String getName() { return name; }
    public String toString() {
        return "Name: " + name + ", Student Number: " + stNo;
    }
}
