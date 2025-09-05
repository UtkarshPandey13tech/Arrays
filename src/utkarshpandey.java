import java.util.*;
public class utkarshpandey {

        // 1. Sort in Descending Order
        public static void sortDescending() {
            int[] arr = {3, 7, 2, 9, 4};
            // Simple bubble sort
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) { // swap
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Descending: " + Arrays.toString(arr));
        }









        // 2. First and Last Occurrence
        public static void firstAndLastOccurrence() {
            int[] arr = {4, 2, 7, 4, 9, 4};
            int target = 4, first = -1, last = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    if (first == -1) first = i;
                    last = i;
                }
            }
            System.out.println("First index: " + first + ", Last index: " + last);
        }











        // 3. Count Frequency
        public static void frequencyCount() {
            int[] arr = {1, 2, 2, 3, 3, 3};
            boolean[] visited = new boolean[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) continue;
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }














        // 4. Reverse Array
        public static void reverseArray() {
            int[] arr = {10, 20, 30, 40, 50};
            int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
            System.out.println("Reversed: " + Arrays.toString(arr));
        }














        // 5. Check Sorted
        public static void checkSorted() {
            int[] arr = {1, 2, 3, 4, 5};
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println("Is sorted? " + sorted);
        }


















        // 6. Copy Even Numbers
        public static void copyEvenNumbers() {
            int[] arr = {1, 4, 6, 7, 8};
            int count = 0;
            for (int num : arr) {
                if (num % 2 == 0) count++;
            }
            int[] evens = new int[count];
            int index = 0;
            for (int num : arr) {
                if (num % 2 == 0) evens[index++] = num;
            }
            System.out.println("Even numbers: " + Arrays.toString(evens));
        }














        // 7. Second Largest
        public static void secondLargest() {
            int[] arr = {10, 20, 4, 45, 99};
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
            System.out.println("Second largest: " + second);
        }














        // 8. Find Duplicates
        public static void findDuplicates() {
            int[] arr = {1, 3, 2, 3, 4, 1};
            boolean[] visited = new boolean[arr.length];
            System.out.print("Duplicates: ");
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) continue;
                boolean dup = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        dup = true;
                    }
                }
                if (dup) System.out.print(arr[i] + " ");
            }
            System.out.println();
        }













        // 9. Merge Two Sorted Arrays
        public static void mergeSortedArrays() {
            int[] a = {1, 3, 5};
            int[] b = {2, 4, 6};
            int[] merged = new int[a.length + b.length];

            int i = 0, j = 0, k = 0;
            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) merged[k++] = a[i++];
                else merged[k++] = b[j++];
            }
            while (i < a.length) merged[k++] = a[i++];
            while (j < b.length) merged[k++] = b[j++];
            System.out.println("Merged: " + Arrays.toString(merged));
        }















        // 10. Binary Search
        public static void binarySearch() {
            int[] arr = {1, 3, 5, 7, 9, 11};
            int target = 7;
            int low = 0, high = arr.length - 1;
            boolean found = false;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    System.out.println("Element " + target + " found at index " + mid);
                    found = true;
                    break;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (!found) System.out.println("Element not found.");
        }

        public static void main(String[] args) {
            sortDescending();
            firstAndLastOccurrence();
            frequencyCount();
            reverseArray();
            checkSorted();
            copyEvenNumbers();
            secondLargest();
            findDuplicates();
            mergeSortedArrays();
            binarySearch();
        }
    }

