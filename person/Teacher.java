package person;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String print() {
        return name + " is " + age + " years old. Her salary is " + salary + " and she is a teacher.";
    }
}
