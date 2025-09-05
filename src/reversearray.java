import java.util.Scanner;
//Q4- Reverse the Array
public class reversearray {
    // Method to reverse the array
    static void reverse(int[] arr) {
        for (int i = 0, r = arr.length - 1; i < r; i++, r--) {
            int tmp = arr[i];
            arr[i] = arr[r];
            arr[r] = tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " +n+ " element:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        // FOR REVERSE
        reverse(arr);

        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

