/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Person {
    private String name;
    private String phone;

    public Person(String n, String ph) {
        name = n;
        phone = ph;
    }
    public String getName() { return name; }
    public String getPhoneNumber() { return phone; }
    public String toString() {
        return "Name: " + name + " Phone: " + phone;
    }
}
