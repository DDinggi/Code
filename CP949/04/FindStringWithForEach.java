/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class FindStringWithForEach {
    public static void main(String[] args) {
        String[] cities = { "New York", "Beijing", "Seoul" };
        boolean found = false;
        int index = 0;
        for (String city : cities) {
            if (city.equals("Seoul")) {
                System.out.printf("%d %s\n", index, cities[index]);
                found = true;
                break; // �ݺ� ����
            }
            index++; 
        }
        if (found == false) {
            System.out.println("Seoul not found");
        }
    }
}
