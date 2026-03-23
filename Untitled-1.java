import java.util.*;
class Node 
{
    int data;
    Node next;
}
class SLL 
{
    Node head,newNode,temp;
    void insertion(int num)
    {
        Node newNode= new Node();
        newNode.data=num;
        newNode.next=null;
        if(head==null)
        {
            head=temp=newNode;
        }
        else
        {
            temp.next=newNode;
            temp=newNode;
        }
    }
    void display()
    {
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    void insertion_at_staring(int A)
    {
        Node newNode = new Node();
        newNode.data=A;
        newNode.next=head;
        head=newNode;
    }
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        SLL sll = new SLL();
        int size=sc.nextInt();
        for(int i=1;i<=size;i++)
        {
            int num=sc.nextInt();
            sll.insertion(num);
        }
        int A=sc.nextInt();
        sll.insertion_at_staring(A);
        sll.display();
    }
}