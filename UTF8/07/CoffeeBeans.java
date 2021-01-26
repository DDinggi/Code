/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
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
