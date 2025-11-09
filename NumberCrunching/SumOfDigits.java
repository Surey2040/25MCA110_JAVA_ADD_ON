import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int Num = input.nextInt();
        int sum = 0,temp;
        while(Num>0){
           temp =  Num % 10;
            sum = sum + temp;
            Num = Num/10;
        }
        System.out.println("The Sum of digits is: "+sum);

        input.close();
    }
}
