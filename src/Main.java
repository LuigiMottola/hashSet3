import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Generator generator1 = new Generator();
        HashSet<Integer> numbersTo15 = new HashSet<>();

        numbersTo15 = generator1.hashSetGenerator();

        Integer newNumber = 4;

        Iterator<Integer> iterator = numbersTo15.iterator();
        while (iterator.hasNext()){
            Integer nextNumber = iterator.next();
            System.out.println(nextNumber);
            if (nextNumber == newNumber){
                iterator.remove();
            }
        }

        System.out.println(numbersTo15);

        numbersTo15.clear();
        System.out.println("Is it clear? " + numbersTo15.isEmpty());
    }
}
