import java.util.Scanner;

public class LeftRotateBy_One {
    static void rotate(int []arr){
        int n= arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void printArray(int[] arr)
    {
        int n= arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
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
        rotate(arr);
        printArray(arr);
    }
}
