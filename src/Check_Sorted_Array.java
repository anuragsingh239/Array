import java.util.Scanner;

public class Check_Sorted_Array {
//    static boolean check(int []arrray,int n){
//        n= arrray.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arrray[j]<arrray[i]){
//                    return false;
//                }
//            }
//        }return true;
//    }

//    EFFECIENT METHOD FOR THIS SOLUTION IS
    static boolean check(int []array,int n){
        n= array.length;
        for(int i=1;i<n;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int length=sc.nextInt();
        int []arr =new int[length];
        System.out.print("Enter the element : ");
        for(int i=0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(check(arr,length));
    }
}
