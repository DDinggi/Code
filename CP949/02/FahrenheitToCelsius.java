/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
// FahrenheitToCelsius.java
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ȭ�� �µ��� �Է��ϼ���: ");       
        float fahrenheit = sc.nextFloat();       
        float celsius = ((float)5 / 9) * (fahrenheit - 32);
        System.out.printf("ȭ�� %.1f���� ���� %.1f�� �Դϴ�", fahrenheit, celsius);
    }
}
