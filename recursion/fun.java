// import java.util.Scanner;

// public class fun {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(sum(n));
//     }
//     public static  int sum(int n){
//     if(n==1){
//        return  1;
//     }
//     return n+sum(n-1);
//     }
// }

/////////////////////////////fabonci////////
// import java.util.Scanner;

// public  class fun {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     System.out.println(fabo(n));
// }
// public  static int fabo(int n){
//        if(n==0){
//       return 0;    
//     }
//     if(n==1){
//         return 1;

//     }
//     return fabo(n-1)+fabo(n-2);
// }

// }



////////////////////////power////////////////////
public  class fun {
    
    public static void main(String[] args) {
       int base=2;
       int exponent=3;
         System.out.println(power(base, exponent));
    }
    public  static  int power(int a, int b){
           if(b==0){
            return 1;
           }
           return a*power(a,b-1);
    }
}