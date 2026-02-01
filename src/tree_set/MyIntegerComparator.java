package tree_set;
import java.util.Comparator; // Required import

public class MyIntegerComparator implements Comparator<Integer> { // Fixed: added implements
        
    @Override // Optional but recommended for clarity
    public int compare(Integer i1, Integer i2) {
        if (i1 > i2) {
            return -1; // Sorting in descending order
        } else if (i1 < i2) {
            return 1;
        }
        return 0; // Standard for equal elements
    }
}