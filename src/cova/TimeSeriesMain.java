package cova; 


import java.util.*; 


public class TimeSeriesMain {
    public static void main(String[] args) {
        // JavaTimeSeries used in Java 
        JavaTimeSeries<Person> peopleData = new JavaTimeSeries(); 
        peopleData.add(new Person()); 
        peopleData.add(new Student()); 
        
        Collection<Student> students = Arrays.asList(new Student(), new Student()); 
        //peopleData.addAll(students) //no covariance (when used from java!)
        peopleData.addAllCovariant(students); // covartiance via <? extends E>

        // Yimr drtird gtom kotlin used in java 
        TimeSeries<Person> peopleDataKt = new TimeSeries<>(); 
        peopleData.add(new Person()); 
        peopleData.add(new Student()); //covariance

        peopleDataKt.addAll(students); // covariance

        System.out.println("gg");
    }
}