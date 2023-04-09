package problem3;

public class Problem3 {
    public static int sumOfArray(int[] arr, int size){
        if(size==0)
            return 0;
        else
            return sumOfArray(arr, size-1) + arr[size-1];
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(sumOfArray(arr,arr.length));
    }
}
