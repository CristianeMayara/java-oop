package vehicle;

public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("accelerate car");
    }

    @Override
    public void brake() {
        System.out.println("brake car");
    }
    
}
