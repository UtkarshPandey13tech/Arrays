import java.util.Scanner;
//Q8- Find Duplicate Elements
public class printduplicate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter  the size of array:");
            int n= sc.nextInt();
            int arr[]= new int[n];
            System.out.println("enter "+n+ " element:");
            for (int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }

            boolean[] visited = new boolean[arr.length];

            System.out.print("Duplicate elements: ");
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) continue;

                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
                }
        }



