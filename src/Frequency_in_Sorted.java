import java.util.Arrays;
import java.util.Scanner;

public class Frequency_in_Sorted {
    static void Count(int[]arr){
        Arrays.sort(arr);
        int n= arr.length;
        int i=1;
        int frequency=1;
        while (i<n){
            while (i<n&&arr[i]==arr[i-1]){
                frequency++;
                i++;
            }
            System.out.println(arr[i-1]+" has frequency "+ frequency);
            i++;
            frequency=1;
        }
        if(n==1||arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" has frequency "+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Count(arr);
    }
}
