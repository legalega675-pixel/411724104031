public class Jun11{
    public static void main(String[] args){
        // int n=10;
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(n<=1){
        //         System.out.print("not prime");
        //     }
        //     else if(i!=2&&i%2==0){
        //         System.out.print("not prime");
        //     }
        //     else if(i==2){
        //         System.out.print("prime");
        //     }
        //    else{
        //     boolean check=true;
        //     }
        //     for(int num=3;num<n;num++){
        //         boolean check=true;
        //         if(num%1==0){
        //             check=false;
        //             break;
        //         }
        //     }
        //     boolean check=true;
        //     if(check==true){
        //         System.out.print("prime");
        //         c++;
        //     }
        //     else{
        //         System.out.println("not prime");
        //     }
        // }

        // int n=12;
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.println(i);
        //         c++;
        //     }
        // }
        // System.out.println(c);

        // int n=20;
        // int c=0;
        // for(int i=1;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         c+=2;
        //         System.out.print(i+" ");
        //         System.out.print(n/i+" ");
        //     }
        // }
        // System.out.println();
        // System.out.println("count:"+c);

        // int a=10;
        // int b=20;
        // int gcd=1;
        // for(int i=1;i<=Math.min(a,b);i++){
        //     if(a%i==0&&b%i==0){
        //         gcd=Math.max(gcd,i);
        //     }
        // }
        // System.out.print(gcd);

        // int a=10;
        // int b=20;
        // int gcd=1;
        // int lcm=1;
        // for(int i=1;i<=Math.min(a,b);i++){ 
        //     if(a%i==0&&b%i==0){
        //         gcd=Math.max(gcd,i);
        //         lcm=(a*b)/gcd;
        //     }
        // }
        // System.out.print(lcm);

        int a=154;
        int b=420;
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }  
        System.out.print("gdc:"+a);
    }
}