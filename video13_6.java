public class video13_6 {
    //        count the numbers which contains even no of digits - done
    public static void main(String[] args) {

        int [] arr = {34,456,3457,4978,6,789123}; //ans - 3
        int count=0;
        int n = total_numbers(arr,count);
        System.out.println("Numbers having even no of digits are "+ n);


    }
    static int total_numbers(int [] arr,int count){


//        check how many no have even no of digits
        for (int i: arr
             ) {
            int digits = 0;

            while (i !=0){
                i=i/10;
                digits++;
            }
//            check if digits = even; count++
            if (digits%2 == 0){
                count ++;
            }

        }



        return count;
    }
}
