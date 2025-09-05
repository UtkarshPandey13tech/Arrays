import java.util.Scanner;
//Q3- Count the Frequency of Each Element
public class frequencycount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int n= sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter " +n+ " elements:");
            for ( int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
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
    }


