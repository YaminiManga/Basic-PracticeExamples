package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntroToStreams {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers=new ArrayList<>();
        //let's filter out odd numbers
        //way1: This is how we generally do
        for (Integer number : numbers)
        {
            if(number%2==0)
            {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even Numbers  "+evenNumbers);
        List<Integer> evenNumbersStream=numbers.stream()
                                                .filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers Stream  "+evenNumbersStream);


    }
}
