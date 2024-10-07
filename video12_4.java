import java.util.ArrayList;
import java.util.Arrays;
public class video12_4 {
    //    4. multi dim array list - done
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>  list1 = new ArrayList<>();

        // Initialize and add a row (1D ArrayList)
        list1.add(new ArrayList<>(Arrays.asList(2, 3, 4)));  // Use Arrays.asList to create a list and then add it

        // Add another row (optional)
        list1.add(new ArrayList<>(Arrays.asList(5, 6, 7)));

        System.out.println(list1);

    }
}
