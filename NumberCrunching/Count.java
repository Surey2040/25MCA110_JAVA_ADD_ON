import  java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int Num = input.nextInt();
        int count = 0;

        while(Num>0){
            Num = Num/10;
            count = count+1; 
        }
        System.out.println(count);
        input.close();

    }
}
