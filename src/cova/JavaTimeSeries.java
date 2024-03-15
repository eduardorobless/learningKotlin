package cova;
import java.util.*; 



public class JavaTimeSeries<E> {
    private final Map<Date, E> date2Data = new HashMap<>();

    public void add(E element) {
            date2Data.put(new Date(), element);
    }




    public void addAll(Collection<E> elements) {
        for (E element: elements) {
            this.add(element);
        }
    }

    public void addAllCovariant(Collection<? extends E> elements) { //E or any of its subtypes
    // need as Java as runtime does not have covariance between two collection types, 
    // as it does not have mutability per se, so you cannot asign a collection subtype 
    // to another collection type because is violating the Liskov substitution principle
        for (E element: elements) {
            this.add(element);
        }
    }


    public E getLatest() {
        Iterator<E> iterator = date2Data.values().iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException("Timeseries is empty, does not have latest element");
        } else {
            E last = iterator.next(); 
            while  (iterator.hasNext()) 
            { 
                last = iterator.next();
            }
            return last;
        }

    }


    public static void greeting() {
        System.out.println("testing method being java and kotlin files mixed"); 
    }
}
 


