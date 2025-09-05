import java.util.*;
public class assingmentarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1- Sort in Descending Order
        System.out.println("enter the size of array for sorting in descending order:");
        int i, j, t, n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the " + n + "element:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter array element before sorting:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        // sort in desc order
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println();
        System.out.println("array element after sorting:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }


//Q2- Find the First and Last Occurrence of a Number
        System.out.println("Enter the array size for first and last occurance:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " element:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no. from array for first and last occurance ");
        int target = sc.nextInt();

        int first = -1, last = -1;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i; //
            }
        }

        System.out.println("First occurrence of " + target + " is at index: " + first);
        System.out.println("Last occurrence of " + target + " is at index: " + last);

        //Q3- Count the Frequency of Each Element

        System.out.println("enter the size of array for count of frequency");
        n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[ar.length];

        for (i = 0; i < ar.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ar[i] + " occurs " + count + " times");

            //Q4- Reverse the Array
            System.out.print("Enter size of array for reverse: ");
            int n4 = sc.nextInt();
            int[] arr4 = new int[n4];
            System.out.println("Enter elements:");
            for (i = 0; i < n4; i++) arr4[i] = sc.nextInt();
            int left = 0, right = n4 - 1;
            while (left < right) {
                int temp = arr4[left];
                arr4[left] = arr4[right];
                arr4[right] = temp;
                left++;
                right--;
            }
            System.out.print("array:");
            for (int x : arr4) System.out.print(x + " ");
            System.out.println("\n");

            //Q5- Check if the Array is Sorted

            System.out.print("Enter size of array to check sorted: ");
            int n5 = sc.nextInt();
            int[] arr5 = new int[n5];
            System.out.println("Enter elements:");
            for (i = 0; i < n5; i++) arr5[i] = sc.nextInt();
            boolean sorted = true;
            for (i = 1; i < n5; i++) {
                if (arr5[i] < arr5[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println("array " + sorted + "\n");

//Q6- Copy Only Even Numbers
            System.out.println("enter the size of array for only even:");
            n = sc.nextInt();
            int array[] = new int[n];
            System.out.println("enter " + n + " elements:");
            for (i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            count = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            int[] evenArr = new int[count];
            int index = 0;

            for (int num : array) {
                if (num % 2 == 0) {
                    evenArr[index++] = num;
                }
            }
            // Print new array
            System.out.print("Even numbers array: ");
            for (int num : evenArr) {
                System.out.print(num + " ");
            }

//Q7- Find the Second Largest Number
            System.out.println("enter  the size of array for second largest:");
            n = sc.nextInt();
            int arra[] = new int[n];
            System.out.println("enter " + n + " element:");
            for (i = 0; i < n; i++) {
                arra[i] = sc.nextInt();
            }
            first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arra) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }

            System.out.println("Second Largest Number: " + second);

            //Q8- Find Duplicate Elements

            System.out.println("enter  the size of array:");
            n = sc.nextInt();
            int arry[] = new int[n];
            System.out.println("enter " + n + " element:");
            for (i = 0; i < n; i++) {
                arry[i] = sc.nextInt();
            }

             visited = new boolean[arry.length];

            System.out.print("Duplicate elements: ");
            for (i = 0; i < arry.length; i++) {
                if (visited[i]) continue;

                boolean isDuplicate = false;
                for (j = i + 1; j < arry.length; j++) {
                    if (arry[i] == arry[j]) {
                        visited[j] = true;
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.print(arry[i] + " ");
                }

                //Q9- Merge Two Sorted Arrays

                int  c[] = {1, 3, 5};
                int[] b = {2, 4, 6};

                int[] merged = new int[c.length + b.length];
                 i = 0; j = 0; int k = 0;
                while (i < c.length && j < b.length) {
                    if (c[i] < b[j]) {
                        merged[k++] = c[i++];
                    } else {
                        merged[k++] = b[j++];
                    }
                }
                while (i < c.length) {
                    merged[k++] = c[i++];
                }
                while (j < b.length) {
                    merged[k++] = b[j++];
                }
                System.out.print("Merged Array: ");
                for (int num : merged) {
                    System.out.print(num + " ");
                }
 //Q10- Binary Search Without Using Built-in Method
                System.out.print("Enter size of array for binary search: ");
                int n10 = sc.nextInt();
                int[] arr10 = new int[n10];
                System.out.println("Enter elements (sorted):");
                for (int ii = 0; ii < n10; ii++) arr10[ii] = sc.nextInt();
                System.out.print("Enter number to search: ");
                int key = sc.nextInt();
                int low = 0, high = n10 - 1, pos = -1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (arr10[mid] == key) { pos = mid; break; }
                    else if (arr10[mid] < key) low = mid + 1;
                    else high = mid - 1;
                }
                if (pos != -1) System.out.println("Found at index " + pos);
                else {System.out.println("Q10 Not found");}

            }


        }

    }
}