/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
public class TestGetClass {    
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        System.out.println("c�� Ŭ������: " + c.getClass());
        
        Arabica a = new Arabica();
        System.out.println("a�� Ŭ������: " + a.getClass());
        
        Robusta r = new Robusta();
        System.out.println("r�� Ŭ������: " + r.getClass());
    }
}
