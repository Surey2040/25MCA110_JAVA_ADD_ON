import java.util.Arrays;

public class Revr {
    public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter number of elements: ");
    //     int n = input.nextInt();
    //     int arr[] = new int[n];

    //     System.out.println("Enter " + n + " numbers:");
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = input.nextInt();
    //     }

    //     // Reverse logic
    //     System.out.println("Reversed array:");
    //     for (int i = n - 1; i >= 0; i--) {
    //         System.out.print(arr[i] + " ");
    //         input.close();
    //     }
    // }

    int[] arr = {1,2,3,4,5};
    int i = 0, j = arr.length - 1,temp;

    while (i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr));
}   
}

