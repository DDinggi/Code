/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Sum1 {
    int sum = 0;   
    int getSum() { return sum; }
    int add(int num) {
        if (num <= 50) { return sum; } // �ƹ��͵� ���� �ʰ� �Լ� ���� ����
        else if (num > 100) { sum += num; } // sum �� ����
        printSum(); // num > 100, 50 < num <= 100 �� ���� ��� �ش��
        return sum;
    }
    void printSum() { System.out.println(getSum()); }

}

class TestSum1 {
    public static void main(String[] args) {
        Sum1 s = new Sum1();
        s.add(101); // 101�� �հ迡 ����. 101�� ���
        s.add(51);  // 51�� ������ �����Ƿ� 101�� ���
        s.add(50);  // 50�� �������� �ʰ�, ��µ� ����
        s.printSum(); // 101�� ���
    }
}
