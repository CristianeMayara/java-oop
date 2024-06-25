package exceptions;

import person.Person;

public class Exceptions {
    public static void main(String[] args) {
        try {
            validate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Person p = null;
        // p.getCpf();
    }

    public static void validate() throws Exception {
        int number = 10;

        if(number < 100) {
            throw new Exception("Number must be bigger than 100.");
        }
    }
}
