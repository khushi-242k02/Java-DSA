public class video14_2 {
    public static void main(String[] args) {
//        agnostic order binary search - done
        int [] arr = {76,54,34,26,11,6,3,5};
        int target = 6;
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int index = binarySearch(arr, target,start,end,mid);
        if (index == -1){
            System.out.println("no element found");
        }
        else{
            System.out.println("element found at "+ index );
        }


    }
    static int binarySearch(int [] arr, int target,int start,int end,int mid){

        if (arr[start]<arr[end]){
//            ascending order
            while (start <= end){
                mid = (start+end)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid+1;



                } else if (arr[mid] > target) {
                    end = mid-1;

                }

            }
            return -1;
        }
        else{
//            descending order
            while (start <= end){
                mid = (start+end)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid+1;



                } else if (arr[mid] < target) {
                    end = mid-1;

                }

            }
            return -1;
        }



    }
}
