/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class CoffeeBean {
    String species = "Coffee";

    void print() { System.out.println(species); }
    void setSpecies(String s) { species = s ; }
}

class Arabica extends CoffeeBean {   
}
 
class Robusta extends CoffeeBean {
    String species = "Robusta";
}
