/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.time.LocalDateTime;

class Appointment {
    private LocalDateTime time;
    private Person person;
    private Place place;

    Appointment(LocalDateTime time, Person person, Place place) {
        this.time = time;
        this.person = person;
        this.place = place;
    }
    public String toString() {
        return "DateTime: " + time.toString() + "\nPerson: " 
               + person.toString() + "\nPlace: " + place.toString();
    }
}
