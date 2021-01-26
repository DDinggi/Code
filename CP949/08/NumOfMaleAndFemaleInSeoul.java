/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class NumOfMaleAndFemaleInSeoul {
    int[][] data = {
        {271654, 295354}, {229829, 231671}, {161055, 166130}, 
        {283869, 296762}, {254381, 249472}, {174996, 181676}, 
        {209344, 210282}, {118965, 114441}, {279169, 293772}, 
        {171576, 176735}, {177841, 177434}, {195734, 203014},
        {182977, 196992}, {148690, 156510}, {212401, 229111},
        {144796, 146776}, {223373, 232245}, {319197, 335045}, 
        {237792, 242641}, {186503, 186856}, {109688, 115744}, 
        {239450, 251066}, {74425, 76326}, {61164, 61636}, {204630, 205980}
    };
    
    int[] getSumByMF() {
        int[] sumMF = { 0, 0 };
        for (int[] gu : data) {
            sumMF[0] += gu[0];
            sumMF[1] += gu[1];
        }
        return sumMF;
    }
    
    public static void main(String[] args) {
        NumOfMaleAndFemaleInSeoul n = new NumOfMaleAndFemaleInSeoul ();
        int[] sumMF = n.getSumByMF();
        System.out.printf("sumM : %d, sumF : %d\n", sumMF[0], sumMF[1]);
    }
}
