/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
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
