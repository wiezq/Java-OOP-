package seven;
import java.util.ArrayList;

public class Testsdpa {

    public static void main(String[] args) {
        int[] a1 = {1, 4, 5, 8, 9};
        int[] a2 = {2, 3, 6, 7, 0};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
