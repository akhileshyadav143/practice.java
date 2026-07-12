
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// public class queue1 {
//     public static void main(String[] args) {
//         ArrayList<Integer> al=new ArrayList<>();
//         Stack<Integer> st=new Stack();
//          Queue<Integer> q=new LinkedList<>();
//          System.out.println(q.isEmpty());
//             q.add(1);
//             q.add(2);
//             q.add(3);
//             q.add(4);
//             q.add(5);

//             System.out.println(q.size());
//          System.out.println(q);
//          q.remove();
//          System.out.println(q);
//          q.poll();
//          System.out.println(q);
//          System.out.println(q.element());
//         System.out.println(q.peek());
//       }
// }

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
   public static void main(String[] args) {
     Queue<Integer> q=new LinkedList<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q);
            Queue<Integer> helper=new LinkedList<>();
            while (q.size()>0) {
                System.out.println(q.peek());
                helper.add(q.poll());
                
            }
   }
    
}