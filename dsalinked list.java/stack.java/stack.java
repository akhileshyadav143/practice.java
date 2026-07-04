// import java.util.*;
// public class stack {
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(1);
//         st.push(45);
//         st.push(10);

//         //peek
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st);


//        System.out.println(st.size());
//        while (st.size()>1) {
//         st.pop();
//        }
//     }
// }

// import java.util.Stack;
// import java.util.*;

// public class stack {
//     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //    Stack<Integer> st=new Stack<>();
// //    int n;
// //    System.out.println("Enter a value");
// //    n=sc.nextInt();
// //    for(int i=0;i<=n;i++){
// //   int  x=sc.nextInt();
// //   st.push(x);
   
// // }
// // System.out.println(st);
//     }

// }



import java.util.Stack;
import java.util.*;

public class stack {
    public static void main(String[] args) {
       Stack<Integer> st=new Stack<>();
       st.push(1);
        st.push(2);
         st.push(3);
          st.push(4);
           st.push(5);
          
           int idx=2;
           int x=7;
           Stack<Integer>temp =new Stack<>();
           while(st.size()>idx){
            temp.push(st.pop());

           }
           st.push(x);
           while (temp.size()>0) {
            st.push(temp.pop());
           }

       System.out.println(st);
    }

}
