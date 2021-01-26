/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Course {
    private final static int MAX_STUDENTS = 30;
    private int numEnrolled = 0;
    private Lecturer lecturer;
    private String room;
    private Book ref;
    private Student[] students = new Student[MAX_STUDENTS];
    
    Course(Lecturer lecturer, String room) {
        this.lecturer = lecturer;
        this.room = room;
    }
    public void setRoom(String room) { this.room = room; }
    public void setBook(Book r) { ref = r; }
    public void enroll(Student s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled] = s;
            numEnrolled++;
        }
    }
    public void drop(Student s) {
        if (numEnrolled > 0) {
            for (int i = 0; i < students.length; i++) {
                // �˻��ؼ� s�� ã���� �ڿ� �ִ� ��ҵ��� �������� ������ ä��
                if (students[i] == s) { 
                    for (int j = i + 1; j < students.length; j++) {
                        students[j - 1] = students[j];
                    }
                    numEnrolled--;
                    break;
                }
            }
        }        
    }
    public int getNumEnrolled() { return numEnrolled; }
    public void printEnrolled() {
        for (int i = 0; i < numEnrolled; i++) {
            System.out.println(students[i]);       
        }
    }
}
