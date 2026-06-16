import java.util.Scanner;
public class Jun09 {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // for(int i=0;i<11;i++){
        //     System.out.println(s.charAt(i));
        // }
                               

        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();                                                  
        // System.out.println(s.length());
       

    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.nextLine();
    //     String s2=sc.nextLine();
    //    if(s1.equals(s2)){
    //         System.out.println("equals");
    //     }
    //     else{
    //         System.out.print("not equal");
    //     }

    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.nextLine();
    //     String s2=sc.nextLine();
    //    if(s1.equalsIgnoreCase(s2)){
    //         System.out.println("equals");
    //     }
    //     else{
    //         System.out.print("not equal");
    //     }

    //    Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    int v=0;
    //    int c=0;
    //    for(int i=0;i<s.length();i++){
    //     char ch=s.charAt(i);
    //      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){   
    //         v++;
    //     }
    //     else{
    //         c++;
    //     }
    //    }
    //    System.out.println(v);
    //    System.out.println(c);

    //    Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    int count=0;
    //    for(int i=0;i<s.length();i++){
    //     char ch=s.charAt(i);
    //    if(Character.isDigit(ch)){
    //     count++;
    //    }
    // }
    // System.out.print(count);

    // Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    int dcount=0;
    //    int lcount=0;
    //    for(int i=0;i<s.length();i++){
    //     char ch=s.charAt(i);
    //    if(Character.isDigit(ch)){
    //     dcount++;
    //    }
    //    else if(Character.isLetter(ch)){
    //     lcount++;
    //    }
    // }
    // System.out.println(dcount);
    // System.out.print(lcount);

    //    Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    int count=0;
    //    for(int i=0;i<s.length();i++){
    //      if(s.charAt(i)=='x'){
    //     count++;
    //    }
    // }
    // System.out.println(count);

    //  Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    for(int i=s.length()-1;i>=0;i--){
    //       System.out.print(s.charAt(i));
    //    }

    //    Scanner sc=new Scanner(System.in);
    //    String s=sc.nextLine();
    //    String str=s.replace(" ","");
    //    System.out.print(str);

       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int i=0;
       int j=s.length()-1;
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            System.out.print("not palindrome");
            break;
        }
        else{
             System.out.print("palindrome");
        }
        i++;
        j--;
       }

    }
}
