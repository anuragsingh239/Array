import java.util.Scanner;

public class unsorted_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the element of array : ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target number to check element : ");
        int target=sc.nextInt();
        boolean found=false;
        for (int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                System.out.println(target +" is presented at index : "+ i);
            }
        }
        if(!found){
            System.out.println(target+" is not present");
        }
    }
}
