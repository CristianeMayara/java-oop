package person;

public class Person {
    String name;
    int age;
    String cpf;

    String print() {
        return name + " is " + age + " years old and her document is " + cpf;
    }
}
