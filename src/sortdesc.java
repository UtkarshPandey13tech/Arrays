import java.util.*;
class sortdesc {
    // Q1- Sort in Descending Order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int i,j,t,n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the "+n+ "element:");
        for (i=0; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter array element before sorting:");
        for (i=0;i<n;i++){
            System.out.println(a[i] + " ");
        }
        // sort in desc order
        for (i=0; i<n ; i++){
            for (j=i+1; j<n;j++){
                if (a[i]<a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println();
        System.out.println("array element after sorting:");
        for (i=0;i<n ;i++){
            System.out.println(a[i]+" ");
        }
    }
}