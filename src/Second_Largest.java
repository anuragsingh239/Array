import java.util.Scanner;

public class Second_Largest {
    static int getLargest(int []array){
        int largest=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>array[largest]){
                largest=i;
            }
        }return largest;
    }
    static int SecondLargest(int []array){
        int result=-1;//because it my chance it has only one value so -1
        int largest=getLargest(array);
        for(int i=0;i<array.length;i++){
            if(array[i]!=array[largest]){
                if(result==-1){
                    result=i;
                } else if (array[i]>array[result]) {
                    result=i;
                }
            }
        }return array[result];
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
        System.out.println(" Second Largest element  : " + SecondLargest(arr));
    }
}
