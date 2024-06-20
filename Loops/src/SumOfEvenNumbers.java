import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(sc.nextLine()));
        int sum = 0;
        int length = 0;

        if(n%2==0){
            length = 2*n;
        }else{
            length = 2*n+1;
        }

        for (int i = 0; i <=length;i++ ){
            if(i%2==0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
