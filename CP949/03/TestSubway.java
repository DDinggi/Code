/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Subway {
    int line;
    void run() { System.out.println(line + " line runs"); }
    void setLine(int l) { line = l; }
}

class TestSubway {
    public static void main(String[] args) {
        Subway mySub = new Subway();
        mySub.setLine(3);
        mySub.run();
    }
}
