package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class average {
    public static void main(String[] args) {
        
        //average age of a list of Person objects using Java streams
        List<persons> list=Arrays.asList(new persons("rob",10),new persons("bob",14),new persons("cob",16),new persons("dob",20));
    
        double avg=list.stream().mapToInt(persons::getAge).average().orElse(0);

        System.out.println(avg);

    
    }
}
