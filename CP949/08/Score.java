/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Score {
    private String subj;
    private double score;
    
    public  Score(String subj, double score) {
        this.subj = subj;
        this.score = score;
    }   
    public double getScore() { return score; }
    public String getSubject() { return subj; }
}
