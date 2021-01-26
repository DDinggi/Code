/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
