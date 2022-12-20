package Test;

public class Sparrow extends Animals implements Flyable{

    public Sparrow(int age, int weight, String gender) {
        super(age, weight, gender);
        //TODO Auto-generated constructor stub
    }


    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Sparrow flying high");
    }


    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("Sparrow flaping wings");
    }
    
}
