package joo.de.java.clip7;

import javax.xml.bind.attachment.AttachmentMarshaller;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intEmptyArray = new int [5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] month = {"1월", "2월", "3월", "4월", "5월"};
        System.out.println(Arrays.toString(month));

        int[] scores = new int[4];
        scores[0] = 5;
        scores[2] = 10;
        System.out.println(Arrays.toString(scores));
        scores[2] = 100;
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);

        int[][] arr = new int[4][3];
        System.out.println(Arrays.toString(arr));
    }
}
