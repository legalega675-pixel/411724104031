import java.util.Scanner;
public class Scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Math.max(a,b);
        System.out.print("max:"+c);
        int d=Math.min(a,b);
        System.out.print("min:"+d);
        // int e=Math.abs(a);
        // System.out.print("abs")
    }
}      