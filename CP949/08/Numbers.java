/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.util.ArrayList;

class Numbers {
    private ArrayList<Integer> myList = new ArrayList<Integer>();
    private int min;
    private int max;
    
    public Numbers(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public void setNumbers() {
        for (int x = min; x <= max; x++) {
            if (x % 4 == 0 && x % 5 != 0) {
                myList.add(x);
            }
        }
    }
    public int sumList() {
        int sum=0;
        for(int i : myList) {
            System.out.printf("%d..", i);
            sum += i;
        }
        return sum;
    }
}
