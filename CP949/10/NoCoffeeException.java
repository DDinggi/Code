/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class NoCoffeeException extends Exception{
    public NoCoffeeException(String e) {
        super(e);
    }
    public String getMessage() {
        System.out.println("Get more coffee!");
        return super.getMessage();
    }
}
