import java.util.Scanner;

public class even {
//Q6- Copy Only Even Numbers
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array:");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter " +n+ " elements:");
            for (int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }

            int count = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            int[] evenArr = new int[count];
            int index = 0;

            for (int num : arr) {
                if (num % 2 == 0) {
                    evenArr[index++] = num;
                }
            }

            // Print new array
            System.out.print("Even numbers array: ");
            for (int num : evenArr) {
                System.out.print(num + " ");
            }
        }
    }


