import java.util.Scanner;
//
//public class First_Largest {
//    NAIVE APPROACH
//    static int getLargest(int []arr){
//        int n= arr.length;
//        for(int i=0;i<n;i++){
//            boolean flag=false;
//            for(int j=0;j<n;j++){
//                if(arr[j]>arr[i]){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag==true){
//                System.out.println(i);
//            }
//        }return -1;
//    }
//    EFFEICIENT APPROACH
public class First_Largest {
        public static int getLargest(int[] array) {
            int result = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > result) {
                    result = array[i];
                }
            }
            return result;
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
            System.out.println("Largest element: " + getLargest(arr));
        }
    }

