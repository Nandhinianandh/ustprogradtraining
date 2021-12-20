import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>(List.of(98,90,34,88));
    /*marks.stream()
           // .filter(x-> x>90)
           //.sorted()
           //  .forEach(m->System.out.println(m));
              //.forEach(System.out::println)
            .findFirst() //intermediate
            .ifPresent(System.out::println);
        int sum=marks.stream()
                .mapToInt(i->i)
                .sum();


        System.out.println(sum);
        IntSummaryStatistics summary=marks.stream();
                .mapToInt(i->i)
                .summarystatistics();
                System.out.println(summary.getAverage());*/
        marks.stream()
                .mapToInt(i->i)
                .average()
                .ifPresent(System.out::println);



    }
}
