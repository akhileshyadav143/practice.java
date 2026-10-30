// import java.util.Scanner;

// public class print {
//     public static void print1(int n){
//        if(n==0)  return;
//        System.out.println(n+" ");
//        print1(n-1);
//     }
// public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//        print1(n);
// }
    
// }

// import java.util.Scanner;

// public class print {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         fun(1,n);
//     }
//     public static void fun(int x,int n){
//          if(x>n) return;
         
//          System.out.println(x+"");
//          fun(x+1,n);
//     }
// }

// import java.util.Scanner;

// public class print {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         oneton(n);
//     }
//     public static void oneton(int n){
//            if (n==0) return ; {
//             System.out.println(n+"");
//             oneton(n-1);
//            }
//     }

// }


// import java.util.Scanner;

// public class print {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         oneton(n);
//     }
//     public static void oneton(int n){
//            if (n==0) return ; {
          
//             oneton(n-1);
//             System.out.print(n+" ");
//            }
//     }

// }



////////////43211234//////////////
// import java.util.Scanner;
// public class print {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         oneton(n);
//     }
//     public static  void oneton(int n){
//            if (n==1)    { 
//                 System.out.println(n+"");
//                  return ; 
//            }{
//            System.out.println(n+" ");
//             oneton(n-1);
//             System.out.println(n+" ");
//            }
//     }

// }


// other
 
import java.util.Scanner;
public class print {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oneton(n);
    }
    public static  void oneton(int n){
           if (n==0)   return ;
           {
           System.out.println(n+" ");
            oneton(n-1);
        if(n!=1)    System.out.println(n+" ");// change other way
           }
    }

}