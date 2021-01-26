/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Sum1 {
    int sum = 0;   
    int getSum() { return sum; }
    int add(int num) {
        if (num <= 50) { return sum; } // 아무것도 하지 않고 함수 실행 종료
        else if (num > 100) { sum += num; } // sum 에 더함
        printSum(); // num > 100, 50 < num <= 100 두 조건 모두 해당됨
        return sum;
    }
    void printSum() { System.out.println(getSum()); }

}

class TestSum1 {
    public static void main(String[] args) {
        Sum1 s = new Sum1();
        s.add(101); // 101을 합계에 더함. 101을 출력
        s.add(51);  // 51을 더하지 않으므로 101을 출력
        s.add(50);  // 50을 더하지도 않고, 출력도 안함
        s.printSum(); // 101을 출력
    }
}
