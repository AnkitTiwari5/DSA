package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class stream {

   public static boolean isPrime(int number) {
  if (number <= 1) {
    return false;
  }
  for (int i = 2; i < number; i++) {
    if (number % i == 0) {
        return false;
    }
  }
  return true;
}

     public static void main(String[] args) {

        //even digits
        ArrayList <Integer> l1=new ArrayList<>();
        
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        List<Integer> s1=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        
        s1.forEach(i->System.out.print(i + " "));

        System.out.println();

        // count frequency of digits.
        List<Integer> l2 = Arrays.asList(1,1,1,1,10,21,21,2,12,1);
        Map<Integer, Long> Frequency = l2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(Frequency);

        //longest string in a list of strings using Java streams.
        List<String> l3=Arrays.asList("Apple","Grapes","Banana","Watermelon");

        Optional <String> s3=l3.stream().max(Comparator.naturalOrder());

        s3.ifPresent(System.out::print);

        System.out.println();

        //Merge two sorted lists into a single sorted list using Java streams
        List<Integer> l4=Arrays.asList(1,2,3,7,9,12);
        List<Integer> l5=Arrays.asList(4,5,6,8,10,11);

        List<Integer> s4=Stream.concat(l4.stream(), l5.stream()).sorted().collect(Collectors.toList());
        s4.forEach(s->System.out.print(s + " "));
        
        System.out.println();


        //prime no
         List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
         List<Integer> Prime = numbers.stream()
                                .filter(stream::isPrime).collect(Collectors.toList());
         System.out.print("List contains a prime number: " + Prime);
         System.out.println();
 

        //remove duplicates from a list of strings using Java streams.
        List<String> l6=Arrays.asList("Apple","Grapes","Banana","Watermelon","Grapes","Banana");

        List<String> s6=l6.stream().distinct().collect(Collectors.toList());
        s6.forEach(s-> System.out.print(s + " "));
        System.out.println();


       //intersection of two lists
       List<Integer> l7=Arrays.asList(1,2,3,4,5,6);
       List<Integer> l8=Arrays.asList(4,5,6,10,11,12);

       Stream<Integer> s7=l7.stream().filter(l8::contains);
       s7.forEach(s->System.out.print(s + " "));

       System.out.println();
       

      //Implement a method to partition a list into two groups based on a predicate using Java streams
      List<Integer> l9 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
      Map<Boolean, List<Integer>> mp=l9.stream().collect(Collectors.partitioningBy(n->n%2==0));
      List<Integer> even=mp.get(true);
      List<Integer> odd=mp.get(false);

      System.out.println("Even " + even);
      System.out.println("Odd"+ odd);

      // kth smallest element in an array using Java streams
      int [] arr={1,2,3,7,8,9};
      int k=3;
      int ksmallest=Arrays.stream(arr).sorted().skip(k-1).findFirst().orElse(-1);

      System.out.println(ksmallest);

      System.out.println();


    //convert lowercase to upper case
    List<String> str=Arrays.asList("qwerty");
    List<String> upper=str.stream().map(String::toUpperCase).collect(Collectors.toList());
    
    System.out.println(upper);

    //reverse a list 
    List<Integer> l10 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> l11 = l10.stream()
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Collections.reverse(list);
                    return list;
                }
            ));
        System.out.println(l11);
    
        //find the first non-repeated character in a string using Java 8 streams.

        String str1="geeks";
         Optional<Character> ch = str1.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();

        ch.ifPresent(System.out::print);


        //find Vowel Count in String using Java 8.  

           String str2 = "ShopOS is blazing fast";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u',
                                       'A', 'E', 'I', 'O', 'U');

        long vowelCount = str2.chars()
            .mapToObj(c -> (char) c)
            .filter(vowels::contains)
            .count();

        System.out.println("Vowel count: " + vowelCount);


        //arrange in desc order with distinct
      int arr2[]={1,2,3,4,5,6,1,2,3,4,10,8};
      List <Integer> l13=IntStream.of(arr2).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      l13.forEach(s->System.out.print(s + " "));

         
    
     }

}