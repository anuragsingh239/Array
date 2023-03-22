//naive approach
import java.util.Scanner;

public class LargestElementInArray {
    static int Largest(int []array){
        int size= array.length;
        for(int i=0;i<size;i++){
            boolean flag=true;
            for(int j=0;i<size;j++){
                if(array[j]>array[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return array[i];
            }
        }return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Largest(array));
    }
}
