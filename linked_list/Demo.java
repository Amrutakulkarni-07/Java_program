
//java code for linked list 

import java.lang.*;
import java.util.*;
class Node <T>
{
    public T data;
    public Node next;
    public Node(T value)
    {
        data = value;
        next = null;
    }
};
class SinglyLinkedList <T>
{
    public Node Head;
    public SinglyLinkedList()
    {
        Head = null;
    }
    public void InsertFirst(T no)
    {
        Node <T> newn = new Node<T>(no);    
        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            newn.next = Head;
            Head = newn;
        }
    }
    public void InsertLast(T no)
    {
        Node <T> newn = new Node <T>(no);    
        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            Node <T> temp = Head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
    }
    public void Display()
    {
        Node <T> temp = Head;
        System.out.println("Elements of linked list are: ");
        
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int Count()
    {
        int icnt = 0;
        Node  <T> temp = Head;
        while(temp != null)
        {
			icnt++;
            temp = temp.next;
        }
		return icnt;
    }
	void DeleteFirst()
	{
		if(Head==null)     //empty 
		{
			return ;
		}
		else       //one or more node 
		{
			Head=Head.next;
		}
	}
	public void DeleteLast()
	{
		if(Head==null)
		{
			return ;
		}
		else
		{
			if(Head.next==null)   //single code 
			{
				Head=null;
				return;
			}
			Node  <T> temp=Head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next=null;
		}
	}
	
	public void InsertAtPos(int pos,T no)
	{
		int i=0;
		int size=Count();
		
		if((pos<1)|| (pos>(size+1)))
       {
           return;
       }
		if(pos==1)
		{
			InsertFirst(no);
		}
		else if(pos== (size+1))    
		{
			InsertLast(no);
		}
		else 
		{
			Node <T> newn=new Node(no);
			
			Node <T> temp=Head;
			for(i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
		}
	}
	
	public void DeleteAtPos(int pos)
	{
		int i=0;
		int size=Count();
		
		if((pos<=0)|| (pos>size))
       {
           return;
       }
		if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==size)
		{
			DeleteLast();
		}
		else 
		{
			
			Node <T> temp=Head;
			for(i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
} ;
    
class Demo
{
    public static void main(String arg[])
    {
		SinglyLinkedList <Float> fobj=new SinglyLinkedList <Float>();
		
			fobj.InsertFirst(11.5f);
			fobj.InsertFirst(34.5f);
			fobj.Display();
			
		  SinglyLinkedList <Integer> obj = new SinglyLinkedList <Integer>();
		Scanner sobj=new Scanner(System.in);
		
		int choice=1;
		int pos=0;
		System.out.println("inside amruta collection framework");
		while(choice!=0)
		{
			System.out.println("--------------------");
		System.out.println("enter your choice:");
		System.out.println("--------------------");
		System.out.println("1.insert first:");
		System.out.println("2.insert last:");
		System.out.println("3.delete first:");
		System.out.println("4.delete last:");
		System.out.println("5.display");
		System.out.println("6.count");
		System.out.println("7.insert at pos");
		System.out.println("8.delete at pos");
	   System.out.println("0.exit:");
	   
		System.out.println("--------------------");
        choice=sobj.nextInt();
		switch(choice)
		{
      
           case 1:
		   System.out.println("enter data");
		   int data=sobj.nextInt();
		   obj.InsertFirst(data);
		   break;
		   
		   case 2:
		   System.out.println("enter data");
		   int data1=sobj.nextInt();
		   obj.InsertLast(data1);
		   break;
        
		  case 3:
		   obj.DeleteFirst();
		   break;
		   
		   case 4:
		   obj.DeleteLast();
		   break;
		   
            case 5:
			obj.Display();
			break;
			
			case 6:
			System.out.println("Number of nodes are : "+obj.Count());
			break;
			
			case 7:
		   System.out.println("enter data");
		   int data3=sobj.nextInt();
		    System.out.println("enter position");
		    pos=sobj.nextInt();
		   obj.InsertAtPos(pos,data3);
		   break;
		   case 8:
		    System.out.println("enter position");
		   int pos1=sobj.nextInt();
		   obj.DeleteAtPos(pos1);
		   break;
		   
		   
         }  //switch end 
        }  //while end 
		
		System.out.println("thank you for using our linked list ");
		obj.Head=null;
}

}