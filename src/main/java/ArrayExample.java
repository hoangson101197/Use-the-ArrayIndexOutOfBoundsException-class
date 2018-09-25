import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("The element list of the array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter an index of any element: ");
        int x = sc.nextInt();
        try {
            System.out.println("The value of the element has an index of " + x + " is: " +arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index exceeds the limit of the array!");
        }
    }
}
