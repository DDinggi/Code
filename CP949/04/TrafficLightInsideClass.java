/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TrafficLightInsideClass {   
    enum TrafficLight {
        RED(30), AMBER(10), GREEN(30);  // ��� ����05           
        int seconds;
       
        TrafficLight(int seconds) { this.seconds = seconds; }
        int getSeconds() { return seconds; } // ���� �ð� Ȯ�ο� �Լ�
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: ���� �ð�: %d\n", light, 
                             light.getSeconds());
        }
    }
}
