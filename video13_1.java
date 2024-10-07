public class video13_1{
    public static void main(String[] args) {

////        linear search in integer array - done
//        int [] arr = { 2,3,45,6,7,2,4,5};
//        int target = 27;
//        int index = linearSearch(arr,target);
//        if (index == -1){
//            System.out.println("No element found");
//        }
//        else {
//            System.out.println("element found at "+ index);
//        }
//
//
//
//    }
//    static int linearSearch(int []arr, int target){
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] == target){
//                return i;
//
//        }
//
//        }
//        return -1;

//        __________________________________________________________________________________________________
        //        linear search in string array
        String str = "Khushi";
        char target = 'k';
        int index = linearSearch(str,target);
        if (index == -1){
            System.out.println("No char found");
        }
        else {
            System.out.println("char found at "+ index);
        }



    }
    static int linearSearch(String str, char target){
        for (int i = 0; i < str.length() ; i++) {
            if (target == str.charAt(i)){
                return i;

            }

        }
        return -1;
    }
}
