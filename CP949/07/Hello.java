/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
abstract class Hello {
    private String toWhom;
    
    public Hello(String whom) { toWhom = whom; }
    public String getWhom() { return toWhom; }    
    public abstract void sayHello();
}
