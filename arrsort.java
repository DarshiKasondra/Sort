import java.io.File;
import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class arrsort {
    public static void main(String args[]) {
       String string = "";
        try {
            Scanner sc = new Scanner(new File("input5.txt")); // reading from the file
            while (sc.hasNextLine()) {
                string = sc.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String num[] = string.split(" ");
        Integer[] list = new Integer[num.length];
        for (int i = 0; i < num.length; i++) {
            list[i] = Integer.valueOf(num[i]);
        }

        Arrays.toString(list);
        Arrays.sort(list, (a, b) -> {
            if (Math.abs(a) < Math.abs(b))
                return -1;// this means don't swap
            if (Math.abs(a) > Math.abs(b))
                return 1;
            if (a < b)
                return -1;
            if (a > b)
                return 1;// means swap
            return 0;
        });
        System.out.println(Arrays.toString(list));
    }
}