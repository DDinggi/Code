/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class FindStringWithForEach {
    public static void main(String[] args) {
        String[] cities = { "New York", "Beijing", "Seoul" };
        boolean found = false;
        int index = 0;
        for (String city : cities) {
            if (city.equals("Seoul")) {
                System.out.printf("%d %s\n", index, cities[index]);
                found = true;
                break; // 반복 종료
            }
            index++; 
        }
        if (found == false) {
            System.out.println("Seoul not found");
        }
    }
}
