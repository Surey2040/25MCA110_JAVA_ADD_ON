public class Factorial {
    public static void main(String[] args) {
        int Num = 145;
        int fact = 1;
        int temp;

            while(Num>0){
                temp = Num/10;
                // fact = temp;
                fact *= temp; 
            }
            System.out.println(fact);
    }
}
