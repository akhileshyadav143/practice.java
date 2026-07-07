public class arrayImplementation {
    
    public static class MyStack {
        private int[] arr = new int[5];
        private int idx = 0; // Starts at 0. Represents the next empty slot.

        // Push: Add an element to the top
        public void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack Overflow! Cannot push " + x);
                return;
            }
            arr[idx] = x;
            idx++; 
        }

        public int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

      
        public int pop() {
            if (idx == 0) {
                System.out.println("Stack Underflow! Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0; // Clear the slot (optional for primitives, good habit)
            idx--;
            return top;
        }

        
        public int size() {
            return idx;
        }
      public boolean isEmpty() {
            return idx == 0;
        }
    }

    public static void main(String[] args) {
        
        MyStack st = new MyStack();
        
        st.push(4);
        st.push(5);
        st.push(1);
        
        System.out.println("Current Size: " + st.size()); // Expected: 3
        System.out.println("Top Element (Peek): " + st.peek()); // Expected: 1
        
        System.out.println("Popped: " + st.pop()); // Expected: 1
        System.out.println("New Size: " + st.size()); // Expected: 2
    }
}