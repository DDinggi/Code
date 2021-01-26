/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Student {
    String name;
    double gpa;
    int incomeLevel;
    
    Student(String name, double gpa, int incomeLevel) {
        this.name = name;
        this.gpa = gpa;
        this.incomeLevel = incomeLevel;
    }
    String getName() { return name; }
    double getGPA() { return gpa; }
    int getIncomeLevel() { return incomeLevel; }
}
