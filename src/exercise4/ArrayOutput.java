package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] numbers = new int[count];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        
            
        
        }
      for (int red=0;red<numbers.length;red++){
      if(red==0){
        System.out.println(numbers[0]);
      }else if (red==-1){
        System.out.println(" " + numbers[1]);

      }else if (red==2){
        System.out.println("  " + numbers[2]);

      }else if (red==3){
        System.out.println("   " + numbers[3]);
      }else if (red==4){
        System.out.println("    " + numbers[4]);
        }else if (red==5){
        System.out.println("     " + numbers[5]);
        }else if (red==6){
        System.out.println("      " + numbers[6]);
        }else if (red==7){
        System.out.println("       " + numbers[7]);
        }else if (red==8){
        System.out.println("        " + numbers[8]);
        }else if (red==9){
        System.out.println("         " + numbers[9]);
        }


        
        
    
   
  }  
}
}
