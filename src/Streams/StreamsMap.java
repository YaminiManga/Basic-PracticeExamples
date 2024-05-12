package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers=numbers.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println("EVEN NUMBERS "+evenNumbers);

       int summation=numbers.stream()
               .reduce(0,(sum,ele)->
                       { return sum+ele; }
               );
        System.out.println(summation);

        List<Integer> Multiplication=numbers.stream()
                .map(num->num*2)
                .collect(Collectors.toList());
        System.out.println("2 Multiplication" +Multiplication);
    }

}