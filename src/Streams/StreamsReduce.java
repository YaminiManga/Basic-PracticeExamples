package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsReduce {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        Integer sumOfNumbers = numbers.stream()
                .reduce(0,(sum,ele)-> {
                    return sum + ele;
                });
        System.out.println(sumOfNumbers);
        Integer maxOfNumbers=numbers.stream()
                .reduce(Integer.MIN_VALUE,(max,ele)->{
                        return Math.max(max,ele);
    });
        System.out.println(maxOfNumbers);

    }


}
