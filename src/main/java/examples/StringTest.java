
package phattara.scit402_lesson5;
import java.util.Scanner;

/**
 *
 * @author koonp@641102064111
 * Create on 6:37:35 PM Aug 29, 2022
 * This file is part of "phattara.scit402_lesson5" Package.
 */
public class StringTest {
    public static void main(String[] atgs){
        String msg1 = "JAVA";
        System.out.print("Enter msg2 = ");
        Scanner scan = new Scanner(System.in);
        String msg2 = scan.nextLine();
        System.out.print("msg1 = "+msg2);
        System.out.print(" and msg2 = "+msg2);
        if(msg1==msg2){
            System.out.print("msg1 == msg2");
        }else{
            System.out.print("msg1 != msg2");
        }
        msg1=msg2;
        System.out.print("msg1 = "+msg1);
        System.out.println(" and msg2 = "+msg2);
        if(msg1==msg2){
            System.out.println("msg1 == msg2");
        }else{
            System.out.println("msg1 != Wmsg2");
        }
    }

}

