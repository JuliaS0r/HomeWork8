import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task1
        int [] arr = new int [3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double [] arr1 = {1.57, 7.654, 9.986};

        int [] arr2 = {3, 7, 8};

        //task2
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //task3
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task4
        for (int i = 0; i < arr.length;  i ++) {
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}