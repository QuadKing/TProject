package holidayOut;

import java.util.Arrays;
import java.util.Scanner;

public class WorkOut {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        int[] aye = new int[5];
//        String[] myNames = {"A", "B", "C", "D"};
//        int[] myNum = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(myNames));
//        System.out.println("Index 2 value = " + myNum[2]);
//        System.out.println("The length elements of variable myNum is = " + myNum.length);
//
//        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        for (int i = 0; i < 7; i++) {
//            System.out.println(days[i]);
//        }
//
//        int[] myArr = {6, 42, 3, 7};
//        int sum=0;
//        for (int i = 0; i < myArr.length; i++) {
//            sum += myArr[i];
//        }
//        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
            int sum = 0;
            for (int i = 0; i < length; i++) {
            if (array[i] % 4 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);

    }
}

