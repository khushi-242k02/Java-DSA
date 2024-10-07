import java.util.Arrays;
import java.util.Scanner;
public class video12_1 {
//    1. one dim array , iterating array using 3 methods - done





public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] arr = new int[5];
    for (int i = 0; i < arr.length ; i++) {
        arr[i] = sc.nextInt();


    }

//    for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i]+" ");
//    }

//    for (int element : arr
//         ) {
//        System.out.println(element);
//    }

    System.out.println(Arrays.toString(arr));

}
}
