package chapterThree;

import java.util.Scanner;
public class Triangle3 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
   
     System.out.println("Enter point x1:");
         float pointx1 = input.nextFloat();
    
        System.out.println("Enter point y1:");
          float pointy1 = input.nextFloat();
   
      System.out.println("Enter point x2:");
        float pointx2 = input.nextFloat();
   
     System.out.println("Enter point y2:");
       float pointy2 = input.nextFloat();
    
      System.out.println("Enter point x3:");
        float pointx3 = input.nextFloat();
    
       System.out.println("Enter point y3:");
         float pointy3 = input.nextFloat();

        double side = (0.5) * (pointx1 * (pointy2 - pointy3) + pointx2 * (pointy3 - pointy1) + pointx3 * (pointy1 - pointy2));
      if( side < 0){
	System.out.printf("The area of the triangle %.1f", -1 * side);
}else{
System.out.printf("The area of the triangle %.1f", side);
}


}


}

