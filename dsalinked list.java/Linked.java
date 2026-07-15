public class Linked {
  public static void display(Node head) {
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data+"");
        temp=temp.next;
    }
  }
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
      display(a);
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

    //     Node temp=a;
    //   for(int i=1;i<5;i++){
    //     System.out.println(temp.data);
    //     temp=temp.next;
    //   }


    Node temp =a;
    while(temp!=null){
        System.out.println(temp.data +""  );
        temp=temp.next;
    }

     }
}
