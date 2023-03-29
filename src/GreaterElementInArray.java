import java.util.Scanner;

public class GreaterElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int []array=new int[size];
        System.out.print("Enter the element : ");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        int max=array[0];
        for (int i=0;i<size;i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        System.out.println(max);
    }
}
