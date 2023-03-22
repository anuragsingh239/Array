import java.util.Scanner;

public class Deletion_on_Array {
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

        // Read in the element to be deleted
        System.out.print("Enter the element to be deleted: ");
        int elementToDelete = scanner.nextInt();

        // Delete the element from the array
        int[] newArray = new int[size-1];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != elementToDelete) {
                newArray[j] = array[i];
                j++;
            }
        }

        // Print out the new array
        System.out.print("New Array: ");
        for (int i = 0; i < size-1; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
