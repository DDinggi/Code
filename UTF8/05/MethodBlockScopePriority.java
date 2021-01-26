/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class MethodBlockScopePriority {
    void printNumbers(int i) {
        int j = 5;
    
        if (true) {
            int k = 5;
            int i = 3;
            int j = 4; 
            System.out.printf("조건문 i = %d, j = %d, k = %d\n", i, j, k);
        }
    }
}
