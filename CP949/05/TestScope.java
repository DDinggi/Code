/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Scope {
    int num1 = 3;
    int num2 = 4;
    
    void printNumbers() {
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
    void printNumbers2() {
        int num1 = 5;  // ScopeŬ������ ��� ������ num1�� ���� �̸�
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
    void printNumbers3(int num1) { // Ŭ���� ��� ������ num1�� ���� �̸�
        int num2 = 5;   // Scope Ŭ������ ��� ������ num2�� ���� �̸�
        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);        
    }
}

class TestScope {
    public static void main(String[] args) {
        Scope scope = new Scope();
        scope.printNumbers();
        scope.printNumbers2();
        scope.printNumbers3(2);
    }
}
