package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator{
    public static void main(String[] args) {

        Comparator<Integer> com =new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j){
                if (i%10>j%10) 
                    return 1;
                else
                return -1;
            }
        };
        

        ArrayList <Integer> List=new ArrayList<Integer>();

        List.add(14);
        List.add(27);
        List.add(20);
        List.add(19);

        System.out.println(List);

        Collections.sort(List,com);

        System.out.println(List);
    }
}