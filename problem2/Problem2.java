package problem2;

import problem1.Problem1;

public class Problem2 {
    public static int countDigits(int num){
        if(num/10==0){
            return 1;
        }
        else{
            return 1+countDigits(num/10);
        }
    }
    public static void main(String[] args){
        System.out.println(Problem2.countDigits(123));

    }
}
