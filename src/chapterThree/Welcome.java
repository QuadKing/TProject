package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Native sunday = new Native();
        String hisName = sunday.getName();
        System.out.println(hisName);

       Scanner input = new Scanner(System.in);
        System.out.println("Enter new name");
        String newName = input.nextLine();
        sunday.setName(newName);
        System.out.println("hisName");
    }
}
