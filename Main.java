class Main {
    public static void main(String[] args) {
        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // int n =5;
        // for(int i=n;i<=n;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        // int n =5;
        // for(int i=n;i<=n;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        
        // int n =21;
        // for(int i=1;i<=6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(n+" ");
        //         n--;
        //     }
        //     System.out.println();
        // }
        
        // int n =15;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(n+" ");
        //         n--;
        //     }
        //     System.out.println();
        // }
        
        // int n =15;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(n+" ");
        //         n--;
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     char ch='A';
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int n=1;n<=2*i-1;n++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int n=1;n<=2*i-1;n++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        
        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int n=1;n<=2*i-1;n++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int n=1;n<=2*i-1;n++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1||i==5||j==1||j==5){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int n=1;n<=i;n++){
                System.out.print(ch);
                ch++;
            }
            for(int i=5;i<=1;i++){
              for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            char cha='A';
            for(int j=i;j>=1;j--){
                System.out.print(cha);
                cha--;
            }
            System.out.println();
        }
        }
    }   
}