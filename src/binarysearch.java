import java.util.Scanner;
//Q10- Binary Search Without Using Built-in Method

public class binarysearch {
        public static int binarySearch(int[] arr, int target) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid + 1; // search right half
                } else {
                    high = mid - 1; // search left half
                }
            }
            return -1; // not found
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter  the size of array:");
            int n= sc.nextInt();
            int arr[]= new int[n];
            System.out.println("enter "+n+ " element:");
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("enter the element you want to search from above :");
            int target = sc.nextInt();

            int result = binarySearch(arr, target);

            if (result != -1) {
                System.out.println("Element " + target + " found at index: " + result);
            } else {
                System.out.println("Element " + target + " not found");
            }
        }
    }
