/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("��Ի�", 4.1, 3);
        Student s2 = new Student("�����", 3.71, 5);
        Student s3 = new Student("�����", 3.93, 7);

        if (s1.getGPA() >= 3.5 && s1.getIncomeLevel() <= 5) {
            System.out.printf("%s�л��� ���л� �ĺ��Դϴ�\n", s1.getName());
        }
        if (s2.getGPA() >= 3.5 && s2.getIncomeLevel() <= 5) {
            System.out.printf("%s�л��� ���л� �ĺ��Դϴ�\n", s2.getName());
        }
        if (s3.getGPA() >= 3.5 && s3.getIncomeLevel() <= 5) {
            System.out.printf("%s�л��� ���л� �ĺ��Դϴ�\n", s3.getName());
        }
    }
}
