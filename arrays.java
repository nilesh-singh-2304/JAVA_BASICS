public class arrays {
    public static void main(String[] args) {
        int arr[];
        arr = new int[5]; // Initialize the array with 5 elements
        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        int j = 0;
        for (int i : arr) {
            System.out.println(i + " : " + j);
            j++;
        }
    }
}
