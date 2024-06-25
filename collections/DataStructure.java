package collections;
import java.util.ArrayList;
import java.util.List;

public class DataStructure {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Mary");
        nameList.add("Elvis");
        nameList.add("Ben");
    
        System.out.println(nameList.get(0));

        for (String name : nameList) {
            System.out.println("The name is " + name);
        }

        nameList.forEach(name -> System.out.println("The name is " + name));
        nameList.forEach(System.out::println);
    }
}
