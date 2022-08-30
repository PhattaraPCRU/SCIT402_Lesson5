
package productcode;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author koonp@641102064111
 * Create on 3:46:21 PM Aug 29, 2022
 * This file is part of "productcode" Package.
 */
public class product_detail {
    //Short Method
    public static <PrintableToString> void p(PrintableToString... args) {
        for(PrintableToString pts: args)
            System.out.print(pts);
        //System.out.println();
    }
    public static <PrintableToString> void pln(PrintableToString... args) {
        for(PrintableToString pts: args)
            System.out.print(pts);
        System.out.println();
    }
    
    //Vars
    String pcode, date, id, size, name;
    int n;
    ArrayList code = new ArrayList();
    
    void inputdata(){
        Scanner scan = new Scanner(System.in);
        pln("Enter product code => ddmmyyyy0000MBreeze : (Prexx x to Exit)");
        do{
            p("product code : ");
            pcode = scan.nextLine();
            if(!(pcode.equals("x"))){
                code.add(pcode);
            }
        }while(!((pcode.equals("x"))));
        
    }
    
    void showdata(){
        if(code.size()>0){
            System.out.printf("%-10s%-6s%-5s%-20s\n", "date","id","size","name");
            for(int i=0;i<code.size();i++){
                date = getinfo(code.get(i).toString(),0,8);
                id = getinfo(code.get(i).toString(),8,12);
                size = getinfo(code.get(i).toString(),12,13);
                name = getinfo(code.get(i).toString(),13,code.get(i).toString().length());
                System.out.printf("%-10s%-6s%-5s%-10s\n",date,id,size,name);
                
            }
        }
    }
    
    String getinfo(String code,int a,int b){
        String info = code.substring(a, b);
        return info;
    }
    
    

}

