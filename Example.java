public class Example{
    public static void main(String[] args){
        int n=1234;
        int c=0;
        for(int i=1;i<0;i++){
            if(n%10==0){
                c++;
                n=n/10;
            }
            System.out.print(c);
        }

//         class Main {
//     public static void main(String[] args) {
//         int num=24;
//         for(int i=1;i<=num;i++){
//             if(num%i==0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }
    }
}