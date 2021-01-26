/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestScore {
    private double englishSum = 0;
    private double mathSum = 0;
    private int englishCount = 0;
    private int mathCount = 0;
    private Score[] scores;
    
    public TestScore(Score[] scores) { this.scores = scores;  }    
    public double getMathSum() { return mathSum; }    
    public double getEnglishSum() { return englishSum; }    
    public int getMathCount() { return mathCount; }    
    public int getEnglishCount() { return englishCount; }    
    public void calcSumAndCount() {
        for (Score obj : scores) {
            String subject = obj.getSubject();
            if (subject.equals("English")) {
                englishSum += obj.getScore();
                englishCount+=1;
            } 
            else if (subject.equals("Math")) {
                mathSum += obj.getScore();
                mathCount += 1;
            }
        }
    }
    
    public static void main(String[] args) {
        Score[] marks = new Score[6];
        marks[0] = new Score("English", 100.0);
        marks[1] = new Score("Math", 80.0);
        marks[2] = new Score("English", 70.0);
        marks[3] = new Score("Math", 100.0);
        marks[4] = new Score("English", 82.3);
        marks[5] = new Score("Math", 98.5);
    
        TestScore scores = new TestScore(marks);
        scores.calcSumAndCount();
        System.out.printf("English: %.1f %.1f %d\n", 
                scores.getEnglishSum() / scores.getEnglishCount(), 
                scores.getEnglishSum(), scores.getEnglishCount());
        System.out.printf("Math: %.1f %.1f %d\n", 
                scores.getMathSum() / scores.getMathCount(), 
                scores.getMathSum(), scores.getMathCount());
    }
}
