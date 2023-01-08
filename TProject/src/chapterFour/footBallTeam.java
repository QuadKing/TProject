package chapterFour;

import java.util.Scanner;

public class footBallTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a number from 1-11 :");
        int input = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("This is a Gaolkeeper post");
                break;
            case 2:
                System.out.println("This is a Defender post");
                break;
            case 3:
                System.out.println("This is a Defender post");
                break;
            case 4:
                System.out.println("This is a Defender post");
                break;
            case 5:
                System.out.println("This is a Defender post");
                break;
            case 6:
                System.out.println("This is a Midfielder post");
                break;
            case 7:
                System.out.println("This is a Midfielder post");
                break;
            case 8:
                System.out.println("This is a Midfielder post");
                break;
            case 9:
                System.out.println("This is a Attacker post");
                break;
            case 10:
                System.out.println("This is a Attacker post");
                break;
            case 11:
                System.out.println("This is a Attacker post");
                break;

        }
    }
}
