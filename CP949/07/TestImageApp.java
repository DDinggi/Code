/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;

public class TestImageApp {    
    public static void main(String[] args) {
        ImageApp imageApp = new ImageApp();        
        Scanner scanner = new Scanner(System.in);
        boolean satisfied = false;
        
        do {
            System.out.print("필터 이름을 입력하세요: ");
            String filterName = scanner.next();
            System.out.println(filterName);
            if (filterName.compareTo("gray") == 0) {
                imageApp.apply(new GrayFilter());
            }
            else if (filterName.compareTo("noise") == 0) {
                imageApp.apply(new NoiseFilter());
            }
            System.out.print("필터 적용 결과에 만족합니까?: ");
            char yesOrNo = scanner.next().charAt(0);            
            if (yesOrNo == 'y') { satisfied = true; }
        } while (satisfied == false);
        System.out.println("필터가 적용된 이미지가 저장되었습니다.");
    }
}
