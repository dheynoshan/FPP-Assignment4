package problem1;

public class Problem1 {
    public static void printReverse(int num){
        if(num>0 && num<10){
            System.out.print(num);
        }
        else{
            int temp = num%10;
            System.out.print(temp);
            num=num/10;
            printReverse(num);
        }
    }

    public static void main(String[] args){
        Problem1.printReverse(123);
    }
}
