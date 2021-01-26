/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class BlockScopePriority {
    int j = 5;
    int i = 4;
    
    void printNumbers(int i) {
        if (true) {
            int k = 5;
            int j = 4; 
            System.out.printf("조건문 i = %d, j = %d, k = %d\n", i, j, k);
        }
        System.out.printf("메소드 i = %d, j = %d\n", i, j);
    }
    
    public static void main(String[] args) {
        BlockScopePriority block = new BlockScopePriority();
        block.printNumbers(3);
    }
}
