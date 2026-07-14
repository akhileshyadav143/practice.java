public class Linked {
    public static class Node{
        int data;  //value
        Node next;  //address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
    //     Node x=new Node();
    //     System.out.println(x.next);
    Node a=new Node(5);
    System.out.println(a.next);
     Node b=new Node(3);
      Node c=new Node(6);

     Node d=new Node(2);
      Node e=new Node(4);
      a.next=b;
      b.next=c;
      c.next=d;
      d.next=e;
    //     System.out.println(a.data);
    //   System.out.println(b.data);
    //   System.out.println(c.data);
    //     System.out.println(d.data);
    //       System.out.println(e.data);
   System.out.println(a.data);
      System.out.println(a.next.data);
      System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
          System.out.println(e.data);


     }
}
