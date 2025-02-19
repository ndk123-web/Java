import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}

public class Stack
{    
    static Node head;
    static boolean isempty()
    {
        return head==null;
    }

    static void push(int data)
    {
        Node newNode = new Node(data);
        Node p=head;
        newNode.data=data;
        if(isempty())
        {
            head=newNode;
        }
        else
        {
            while(p.next!=null){
                p=p.next;
            }
            p.next=newNode;
            newNode.next=null;
        }
    }

    static int pop()
    {
        int top;
        if(isempty()){
            return -1;
        }else{
            top=head.data;
            head=head.next;
            return top;
        }
    }

    static int peek()
    {
        int top;
        if(isempty()){
            return -1;
        }
        else{
            top=head.data;
            return top;
        }
    }
    

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        int t;
        while(!isempty()){
            t=s.peek();
            s.pop();
            System.out.println(t);
        }
    }
}