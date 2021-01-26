/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.time.LocalDateTime;

class TestHospitalAppointment {
    public static void main(String[] args) {
        Doctor d = new Doctor(10, "Dr. Lim"); // 의사 생성
        Patient p = new Patient("cho"); // 환자 생성

        // 예약 날짜 생성
        LocalDateTime d1 = LocalDateTime.of(2020, 5, 20, 13, 30, 0);
        LocalDateTime d2 = LocalDateTime.of(2020, 6, 20, 13, 30, 0);
        LocalDateTime d3 = LocalDateTime.of(2020, 7, 20, 13, 30, 0);

        HospitalAppointment[] has = new HospitalAppointment[3];
        has[0] = new HospitalAppointment(d, p, d1);
        has[1] = new HospitalAppointment(d, p, d2);
        has[2] = new HospitalAppointment(d, p, d3);
        
        for (HospitalAppointment apnt : has) { // 화면에 출력
            System.out.println(apnt);
        }
    }
}
