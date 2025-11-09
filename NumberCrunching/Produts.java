import java.util.*;
public class Produts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Digits: ");
        int Num = input.nextInt();
        int pro = 1,temp;
        while (Num>0) { 
            temp = Num%10;
            pro = pro * temp;
            Num = Num/10;
        }
        System.out.println("the product is: "+ pro);
        input.close();

    }
}
