package vehicle;

public class Motorcycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("accelerate motorcycle");
    }

    @Override
    public void brake() {
        System.out.println("brake motorcycle");
    }

}
