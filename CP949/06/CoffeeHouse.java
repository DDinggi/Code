/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class CoffeeHouse {
    private static final int MAX_ORDER = 100;
    private String name;
    private String phoneNo;
    private String address;
    private int nLike;
    private Order[] orders;
    private int nOrder;
    
    public CoffeeHouse(String name, String phone, String addr) {
        this.name = name;
        phoneNo = phone;
        address = addr;
        orders = new Order[MAX_ORDER];
        nOrder = 0;
        nLike = 0;        
    }
    public String getAddress() { return address; }    
    public String getPhoneNo() { return phoneNo; }    
    public int getLike() {  return nLike; }    
    public int increaseLike() {
        nLike++;
        return nLike;
    }    
    public void addOrder(Order order) {
        if (nOrder < MAX_ORDER) {
            orders[nOrder] = order;
            nOrder++;
        }
    }
}
