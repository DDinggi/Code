/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class ObjectOrientedCourse {
    private final int MAX_STUDENTS = 30;
    private int numEnrolled = 0;
    private String lecturer;
    private String room;
    private String[] students = new String[MAX_STUDENTS];

    public ObjectOrientedCourse(String lecturer, String room) {
        this.lecturer = lecturer;
        this.room = room;
    }    
    public setRoom(String room) { this.room = room; }    
    public void enroll(String s) {
        if (numEnrolled < MAX_STUDENTS) {
            students[numEnrolled] = s;
            numEnrolled++;
        }
    }    
    public void drop(String s) {
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
