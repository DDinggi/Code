/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.time.LocalDateTime;

class TestHospitalAppointment {
    public static void main(String[] args) {
        Doctor d = new Doctor(10, "Dr. Lim"); // �ǻ� ����
        Patient p = new Patient("cho"); // ȯ�� ����

        // ���� ��¥ ����
        LocalDateTime d1 = LocalDateTime.of(2020, 5, 20, 13, 30, 0);
        LocalDateTime d2 = LocalDateTime.of(2020, 6, 20, 13, 30, 0);
        LocalDateTime d3 = LocalDateTime.of(2020, 7, 20, 13, 30, 0);

        HospitalAppointment[] has = new HospitalAppointment[3];
        has[0] = new HospitalAppointment(d, p, d1);
        has[1] = new HospitalAppointment(d, p, d2);
        has[2] = new HospitalAppointment(d, p, d3);
        
        for (HospitalAppointment apnt : has) { // ȭ�鿡 ���
            System.out.println(apnt);
        }
    }
}
