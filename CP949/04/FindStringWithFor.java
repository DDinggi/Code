/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class FindStringWithFor {
    public static void main(String[] args) {
        String[] cities = { "New York", "Beijing", "Seoul" };
        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals("Seoul")) {
                System.out.printf("%d %s\n", i, cities[i]);
                found = true;
                break; // �ݺ� ����
             } 
        }        
        if (found == false) {
            System.out.println("Seoul not found");
        }
    }
}
