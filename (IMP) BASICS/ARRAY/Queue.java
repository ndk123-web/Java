import java.util.*;
import java.util.Scanner;

class Queuee {
    private int a[] = new int[5];
    private int rr, fr;

    public Queuee() {
        fr = 0;
        rr = -1;
    }

    public void enqueue(int ele) {
        if (rr==4)
           System.out.print("QUEUE FULL");  
        else {
            rr++;
            a[rr] = ele;
        }
    }

    public int dequeue() {
        if(fr>rr)
        {
         System.out.print("QUEUE EMPTY");   
         return 0;
        
        }
        int x;
        x = a[fr];
        fr++;
        return x;
    }

    public int top() {
        if(fr>rr)
        {
            System.out.print("QUEUE EMPTY\n");
            return 0;
        }
        return a[fr];
    }

    public void display() {
        int i;
        if(fr>rr)
        {
            System.out.print("QUEUE EMPTY");
        }
        for (i = fr; i <= rr; i++) {
            System.out.print(a[i] + "\t");
        }
    }

}

    public class Queue{
    public static void main(String args[]) {
        int ch,ele;
        Queuee u=new Queuee();
        Scanner sc=new Scanner (System.in);
        while(true)
        {
            System.out.print("1.Enqueue\n2.Dequeue\n3.top\n4.display\n5.Exit\n");
            System.out.print("Enter your choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.print("Enter data");
                        ele=sc.nextInt();
                        u.enqueue(ele);
                        break;
                        
                case 2: System.out.print("Popped: "+u.dequeue());
                        break;
                        
                case 3: System.out.print("QueueTop: "+u.top());
                        break;
                        
                case 4: u.display();
                        break;
                        
                case 5: System.out.print("Thankyou!");
                        return;
                
                default: System.out.print("Invalid Choice");
                         break;
            }
        }
    }
}
