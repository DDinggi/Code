/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
package com.my.hello;

class Hello { // public�� ������ ����
    String toWhom = "world";

    public Hello2() { }
    public Hello2(String toWhom) { this.toWhom = toWhom; }
    public void sayHello() { System.out.printf("hello %s!", toWhom); }
}
