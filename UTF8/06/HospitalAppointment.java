/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.time.LocalDateTime;

class HospitalAppointment {
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime date;

    public HospitalAppointment(Doctor doctor, Patient patient, 
                               LocalDateTime date) {
       this.doctor = doctor;
       this.patient = patient;
       this.date = date;
    }
    public String toString() {
        return "HospitalAppointment: " + date.toString() + "\n" 
               + doctor.toString() + "\n" + patient.toString();
    }
}
