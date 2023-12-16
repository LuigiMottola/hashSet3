import java.util.HashSet;
import java.util.List;

public class Generator {
    public HashSet hashSetGenerator(){
        HashSet<Integer> createNumbersTo15 = new HashSet<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15));
        return createNumbersTo15;
    }
}
