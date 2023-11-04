package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    public static boolean containsInArray(int[] arr, int num) {
        boolean doesContain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                doesContain = true;
            }
        }
        return doesContain;
    }
}
