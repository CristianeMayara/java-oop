package collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Mary", 10);
        grades.put("John", 8);
        grades.put("Elis", 9);

        var grade = grades.get("Mary");
        System.out.println(grade);

        for(Map.Entry<String, Integer> entry : grades.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " got a " + value);
        }


        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("555555555");
        phoneNumbers.add("523456677");
        phoneNumbers.add("543267855");

        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println(phoneNumbers.contains("555555555"));

    }
}
