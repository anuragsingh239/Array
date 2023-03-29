import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Duplicate");
        }
        if(!flag){
            System.out.println("Not");
        }
    }
}
