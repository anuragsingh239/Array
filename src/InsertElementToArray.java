public class InsertElementToArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 }; // declare and initialize an array
        int element = 3; // element to be inserted
        int index = 2; // index where the element is to be inserted

        // shift the elements to the right to create space for the new element
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // insert the new element
        arr[index] = element;

        // print the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
