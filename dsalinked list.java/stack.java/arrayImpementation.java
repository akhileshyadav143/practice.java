import java.util.Stack;

public class arrayImpementation {
    public static class Satck {
    int arr[]=new int[5];
    private int idx =-1
    void push(int x){
              arr[idx]=x;
              idx++;                
    }
    int peek(){
        if(idx==0){
            System.out.println("Satck is Empty");
            return -1;

        }
   int pop(){
    System.out.println("stack is empty");

        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;

    }
        
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        

        System.out.println(st.size());
        st.pop();

    }
}
