import java.util.Scanner;

public class Remove {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] ptn = s.split("[ ]+");
    
      for(int i=0; i<ptn.length; i++){
       
        if("the".equals(ptn[i])) {
        	continue;
        }else {
        	 System.out.print(ptn[i] + " ");
        }
     }
      
     
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
//         String str = a.replace("the ","");
//        
//        String str1 = str.replace("the","");
//         // String sum = str.concat(str1);
//          String t=str1.replace(" "," ");
//         System.out.println(t);
//      
     
}
}
