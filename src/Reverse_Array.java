import java.util.Scanner;

public class Reverse_Array {
    static void reverse(int [] arr){
        int low=0;
        int high= arr.length-1;
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size= sc.nextInt();
        System.out.print("Enter the element : ");
        int []array=new int[size];
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        reverse(array);
    }
}
