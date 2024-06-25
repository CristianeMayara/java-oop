package person;

public class Student extends Person {
    private String registrationId;

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    String print() {
        System.out.println(super.print());
        return "She is a student";
    }
}
