/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TemperatureAtAirPort {
    String name;
    int temperature;
    
    TemperatureAtAirPort(String name, int temp) {
        this.name = name;
        temperature = temp;
    }
    public String toString() {
        return "공항: " + name + "\t온도: " + temperature;
    }
}
