/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class BlockScope {
    public static void main(String[] args) {
        if (true) {
            int i = 3;
            int j = 4; // 이 영역을 벗어나면 사용 못함
            System.out.printf("조건문 i = %d\n", i);
        }
            
        for (int n = 0; n < 3; n++) {
            int i = 4;
            int k = 5; // 이 영역을 벗어나면 사용 못함
            System.out.printf("반복문 i = %d\n", i);
        }

        {  // 새로운 코드 블록 시작
            int i = 5;
            System.out.printf("새로운 코드 블록 i = %d\n", i);
        }  // 새로운 코드 블록 끝
        //System.out.printf("i = %d, j = %d\n", i, j); // 오류 발생
    }
}
