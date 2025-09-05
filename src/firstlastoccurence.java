import java.util.*;
// Q2- Find the First and Last Occurrence of a Number
public class firstlastoccurence {
    // Q2- Find the First and Last Occurrence of a Number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " element:");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the no. from array for first and last occurance ");
        int target = sc.nextInt();

        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i; //
            }
        }

        System.out.println("First occurrence of " + target + " is at index: " + first);
        System.out.println("Last occurrence of " + target + " is at index: " + last);
    }
}
