package chapterSix;

public class RecursionSample {
    public static void main(String[] args) {
        rightAngle(5);
    }
    private static void rightAngle(int number) {
        if(number < 1) {
            return;
        }
        number=number-1;
        rightAngle(number);
        for (int i = 0; i < number; i++) {
            System.out.print(" *");
        }
        System.out.println();
    }
}

/* Types of return-type
1. One with a VOID method.
2. One with a condition, with the specified return type.(E.G STRING)
3. One that returns control to the caller of the method....Syntax== return;
 */
