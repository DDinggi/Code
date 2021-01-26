/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
// ConvertFahrenheit23.java
public class ConvertFahrenheit23 {
    public static void main(String[] args) {
        float fahrenheit = 23;
        float celsius = ((float) 5 / 9) * (fahrenheit - 32);
        System.out.printf("Fahrenheit %.2f is %.2f in Celsius\n", fahrenheit, celsius);
    }
}