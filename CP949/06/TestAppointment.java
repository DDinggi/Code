/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.time.LocalDateTime;

public class TestAppointment {
    public static void main(String[] args) {
        Appointment appt = new Appointment(
                              LocalDateTime.of(2020, 5, 19, 16, 30, 0), 
                                new Person("cho", "111-1111-1111"),
                                new Place("jongno", "222-2222-2222"));
        System.out.println(appt);
    }
}
