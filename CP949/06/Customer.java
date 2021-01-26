/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
