public class checksorted {
    //Q5- Check if the Array is Sorted

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 30, 20, 40};

        System.out.println("arr1 sorted? " + isSorted(arr1)); // true
        System.out.println("arr2 sorted? " + isSorted(arr2)); // false
    }
}


