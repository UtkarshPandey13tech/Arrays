import java.util.Scanner;
public class secondmax {
    //Q7- Find the Second Largest Number
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter  the size of array:");
            int n= sc.nextInt();
            int arr[]= new int[n];
            System.out.println("enter "+n+ " element:");
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }

            System.out.println("Second Largest Number: " + second);
        }
    }


