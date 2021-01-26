/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class Turtle {
    private int limbs = 4;
    protected String food;

    public int getLimbs() { return this.limbs; }
    public void setFood(String f) { this.food = f; }
    public void eat() { System.out.println("Turtle eats " + food); }  
}

class SeaTurtle extends Turtle {
    public void swim() { System.out.println("A sea turtle swims..."); }
    public void printLimbs() { 
        System.out.println("limbs: " + getLimbs()); 
    }
}

class LandTurtle extends Turtle {
    public void walk() { System.out.println("A land turtle walks..."); }
    public void printLimbs() { 
        System.out.println("limbs: " + getLimbs()); 
    }
}
