/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TestCourse {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("�躹��", "GB112", "bk32@ac.kr");
        Course oo1 = new Course(lecturer, "GB111");
        Student s1 = new Student("202011111", "jsl");
        Student s2 = new Student("202011112", "bdk");
        Student s3 = new Student("202011112", "cho");

        oo1.enroll(s1);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.printEnrolled();                      
    }
}
