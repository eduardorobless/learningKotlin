package oo;
import java.util.*;

public class MainJavaTimeSeries{ 
    public static void main(String[] args) {
        System.out.println("Im in main java time series");
        JavaTimeSeries<Integer> test=  new JavaTimeSeries<>();
        test.add(4);
        test.addAll(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(test.getLatest());
    }

}