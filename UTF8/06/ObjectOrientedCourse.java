/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
                // 검색해서 s를 찾으면 뒤에 있는 요소들을 움직여서 앞으로 채움
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
