/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Lecturer {
    private String email;
    private String name;
    private String room;
    
    public Lecturer(String name, String room, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getRoom() { return room; }
}
