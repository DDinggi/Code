/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Customer {
    private String name;
    private String phoneNo;
    private int visit;

    Customer(String name, String phNo) {
        this.name = name;
        phoneNo = phNo;
        visit = 0;
    }
    public String getName() { return name;  }
    public String getPhoneNo() { return phoneNo;  }
    public int increaseVisit() {
        visit++;
        return visit;
    }
    public void resetVisit() { visit = 0; }
}
