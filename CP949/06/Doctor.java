/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
