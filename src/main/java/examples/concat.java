
package examples;

/**
 *
 * @author koonp@641102064111
 * Create on 9:43:08 AM Aug 31, 2022
 * This file is part of "work" Package.
 */
public class concat {
    public static void main(String[] args){
        String msg1 = "JAVA";
        String msg2 = " Programing";
        String msg3 = " Language";
        String msg = msg1.concat(msg2);
        System.out.println(msg);
        msg = msg+msg3;
        System.out.println(msg);
    }

}

