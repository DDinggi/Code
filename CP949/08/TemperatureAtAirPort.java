/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class TemperatureAtAirPort {
    String name;
    int temperature;
    
    TemperatureAtAirPort(String name, int temp) {
        this.name = name;
        temperature = temp;
    }
    public String toString() {
        return "����: " + name + "\t�µ�: " + temperature;
    }
}
