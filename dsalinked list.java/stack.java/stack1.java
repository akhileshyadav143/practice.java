import java.util.Stack;

public class stack1 {
    public static void pushatbottem(Stack<Integer> st,int n) {
        if(st.size()==0) st.push(n);

        int top=st.pop();
        pushatbottem(st, n);
        st.push(top);
      
    }
    public static void reverse(Stack<Integer> st) {
        if(st.size()==1){
            int top=st.pop();
            reverse(st);
            pushatbottem(st,top);
               
        }
    }
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
       st.push(1);
        st.push(2);
         st.push(3);
          st.push(4);
           st.push(5);
System.out.println(st);

//            System.out.println(st);
//     Stack<Integer> rt=new Stack<>();
//     while (st.size()>0) {
        
    
//           rt.push(st.pop());
//     }
//     System.out.println(rt);

//      Stack<Integer> qt=new Stack<>();
//       while(rt.size()>0){
//            qt.push(rt.pop());
//       }
//       System.out.println(qt);
    }
}
