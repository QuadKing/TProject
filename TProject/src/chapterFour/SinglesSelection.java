package chapterFour;

import java.util.Scanner;

public class SinglesSelection {
    public static void main(String[] args) {
        //collect the inout
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userinput = inputCollector.nextInt();

        //check userinput:
        if(userinput >10){
            System.out.println("Out of Range");
        }
        else {
            if (userinput % 2 == 0)
                System.out.println("This is even");
            else {
            System.out.println("This is odd");
            }
        }
        //if(userinput%2>=0){
            //System.out.println("It is odd");
        }
    }

