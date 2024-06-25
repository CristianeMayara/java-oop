package person;

public class PersonUse {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mary";
        teacher.age = 32;
        teacher.cpf = "1234567891";
        teacher.setSalary(50000);

        System.out.println(teacher.print());

        Student student = new Student();
        student.name = "Jess";
        student.age = 19;
        student.cpf = "6542357909";
        student.setRegistrationId("5467");

        System.out.println(student.print());
    }
}
