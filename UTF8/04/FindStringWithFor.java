/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class FindStringWithFor {
    public static void main(String[] args) {
        String[] cities = { "New York", "Beijing", "Seoul" };
        boolean found = false;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals("Seoul")) {
                System.out.printf("%d %s\n", i, cities[i]);
                found = true;
                break; // 반복 종료
             } 
        }        
        if (found == false) {
            System.out.println("Seoul not found");
        }
    }
}
