/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TrafficLightInsideClass {   
    enum TrafficLight {
        RED(30), AMBER(10), GREEN(30);  // 상수 지정05           
        int seconds;
       
        TrafficLight(int seconds) { this.seconds = seconds; }
        int getSeconds() { return seconds; } // 유지 시간 확인용 함수
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: 유지 시간: %d\n", light, 
                             light.getSeconds());
        }
    }
}
