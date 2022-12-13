import java.util.Scanner;
class Dnode //creating a Node
{
	int key;
	Dnode left,right;
	
	public Dnode(int key) 
	{
		
		this.key=key;
		this.left=null;
		this.right=null;
	}
}


public class DoubleLinkedListExam {
		Dnode root;
	public void createDoubleLinkedList()// creating the list
	{
		root=null;
	}
	
	
	 void insertRight(int key)
     
	    {
	        Dnode n=new Dnode(key);
	        if(root==null)// if node is not present then node that has  created become a root node
	            root=n;
	        else
	        {
	            Dnode temp=root; //creating a variable of Dnode type to traverse the list
	            while(temp.right!=null)//for reaching to the last Dnode
	                temp=temp.right;
	            	temp.right=n;// adding new Dnode in list
	            	n.left=temp;
	        }
	    }
	 
	 void printTravese()
	 {
	     if(root==null)
	              System.out.println("List Empty");
	     else
	     {
	         Dnode temp;
	         temp=root;
	         while(temp.right!=null)//to stop at last
	         {
	            temp=temp.right;
	         }
	         while(temp!=null)//stop when null 
	         {
	             System.out.println(temp.key);
	             temp=temp.left;
	         }
	     }
	   }
	 
	 
	   void splitList() {
	    	
		if(root==null)
			System.out.println("List Empty");
   else
   {
	   Dnode temp1, temp2, temp;
	   int i=1;
	   
	   temp1=temp2=temp=root;
	   
	   while(temp!= null) {
		   
	   if(i%2!=0)
	   {
		  temp1=temp;
		  System.out.println("odd position element"+temp1.key);
	   }
	   else
	   {
		   
		   temp2=temp;
		   if(temp.right!=null) {
		   System.out.println("even position element"+temp2.key);
		   }
	   }
	   temp=temp.right;
	   i++;
	   }
	   while(temp1!=null && temp2 != null)//2

	   		temp1=temp2=root;
	   {
		   System.out.println(temp1.key);
		   temp1=temp1.right;
		   System.out.println(temp2.key);
		   temp2=temp2.right;
	   }	 
	
   }
		
		   
	   
   }
			

	 // menu driven
public static void main(String args[])
{
    int choice;
    int key =0;
    DoubleLinkedListExam obj=new  DoubleLinkedListExam();
    Scanner in=new Scanner(System.in);
    obj.createDoubleLinkedList();
    do
    {
         System.out.println("\n----------\n1.InsertRight\n2.printTravese\n3.SplistList \n----------");
         						;
         choice=in.nextInt();
         switch(choice)
         {
            
              case 1:
                        System.out.println("Enter key:");
                         key=in.nextInt(); 
                         obj.insertRight(key);
                         break;
                 
               case 2:
                   		obj. printTravese();
                   		break;
            
               case 3:
             		obj. splitList();
             		break;
             		
              		
               default:
            	   		System.out.println("Wrong option selected");
            	   		break;
         }
    }while(choice!=0);
    	in.close();
    }           

}