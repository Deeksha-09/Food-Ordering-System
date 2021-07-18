package project;
import java.util.*;
public class foodorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Customer name:");
        String name=o.nextLine();
        System.out.println("\nWelcome to Java Hotel"+"  "+name);
        int a,b,c,d,e,f,l;
        int eachcost=0;
        int cost=0;
        int price=0;
        String y,v;
        String item=" ";
        System.out.println(" ");
        System.out.println("Menu Card");
        System.out.println(" ");
        System.out.println("Item name\t\tPrice(Rs.)\tPress to order");
        System.out.println(" ");
        System.out.println("Pani Puri\t\t20\t\t1");
        System.out.println("Masala Puri\t\t40\t\t2");
        System.out.println("Dahi Puri\t\t35\t\t3");
        System.out.println("Sev Puri\t\t30\t\t4");
        System.out.println("Bhel Puri\t\t35\t\t5");
        System.out.println(" ");
        ArrayList order=new ArrayList();
        ArrayList<Integer> pric=new ArrayList<>();
        ArrayList plate=new ArrayList();
        ArrayList del=new ArrayList();
        do
        {
        	System.out.println("Press to Order");
        	a=o.nextInt();
        	int press[]=new int[]{a};
        	System.out.println("Enter the number of plates");
        	b=o.nextInt();
        	System.out.println(" ");
        	if(a==1)
        	{
        		item="Pani Puri";
        		price=20;
        		eachcost=price*b;
        		cost+=eachcost;
        		boolean of=order.contains(item);
        		if(of)
        		{
        			order.add("");
        			pric.add(eachcost);
        			plate.add(b);
        		}
        		else
        		{
        			pric.add(eachcost);
        			plate.add(b);
        			order.add(item);
        		}
        	}
        		if(a==2)
            	{
            		item="Masala Puri";
            		price=40;
            		eachcost=price*b;
            		cost+=eachcost;
            		
            		order.add(item);
            		pric.add(eachcost);
            		plate.add(b);
            	}
        		if(a==3)
            	{
            		item="Dahi Puri";
            		price=35;
            		eachcost=price*b;
            		cost+=eachcost;
            		//boolean f=order.contains(item);
            		order.add(item);
            		pric.add(eachcost);
            		plate.add(b);
            	}
        		if(a==4)
            	{
            		item="Sev Puri";
            		price=30;
            		eachcost=price*b;
            		cost+=eachcost;
            		//boolean f=order.contains(item);
            		order.add(item);
            		pric.add(eachcost);
            		plate.add(b);
            	}
        		if(a==5)
            	{
            		item="Bhel Puri";
            		price=35;
            		eachcost=price*b;
            		cost+=eachcost;
            		//boolean f=order.contains(item);
            		order.add(item);
            		pric.add(eachcost);
            		plate.add(b);
            	}
        	    for(int k=0;k<press.length;k++)
        	    {
        	    	String itemname=" ";
        	    	if(press[k]==1)
        	    	{
        	    		del.add(press[k]);
        	    		itemname="Pani Puri";
        	    	}
        	    	if(press[k]==2)
        	    	{
        	    		del.add(press[k]);
        	    		itemname="Masala Puri";
        	    	}
        	    	if(press[k]==3)
        	    	{
        	    		del.add(press[k]);
        	    		itemname="Dahi Puri";
        	    	}
        	    	if(press[k]==4)
        	    	{
        	    		del.add(press[k]);
        	    		itemname="Sev Puri";
        	    	}
        	    	if(press[k]==5)
        	    	{
        	    		del.add(press[k]);
        	    		itemname="Bhel Puri";
        	    	}
        	    }
        	    System.out.println("Do you want to continue(Yes/No)");
        	    y=o.next();
        	    System.out.println(" ");
        	}while(y!="No");
        System.out.println(" ");
        System.out.println("Item Names\t\t\tNo. of plates\t\tSub total\t\tPress to delete");
        Iterator it=order.iterator();
        Iterator<Integer> i1=pric.iterator();
        Iterator i2=plate.iterator();
        Iterator i3=del.iterator();
        while(it.hasNext() && i1.hasNext() && i2.hasNext())
        {
             System.out.println(it.next()+"\t\t\t"+i2.next()+"\t\t\t"+i1.next()+"\t\t\t"+i3.next());
             System.out.println();
        }
        System.out.println();
        System.out.println("Total Bill:\t\t\t     \t\t\t"+cost);
        System.out.println();
        System.out.println("Do you want to delete the order(1/0)");
        l=o.nextInt();
        System.out.println();
        if(l==1)
        {
        	
        	do
        	{
        		if(order.isEmpty())
        		{
        			System.out.println("Your cart is empty");
        			break;
        		}
        		else
        		{
        			System.out.println("Press to delete");
        			f=o.nextInt();
        			int delete[]=new int[]{f};
        		if(f==1)
        		{
        			item="Pani Puri";
        			boolean of=order.contains(item);
        			int f1=order.indexOf(item);
        			if(of)
        			{
        				order.remove(item);
        				cost=cost-pric.remove(f1);
        				plate.remove(f1);
        			}
        		}
        		if(f==2)
        		{
        			item="Masala Puri";
        			boolean of=order.contains(item);
        			int f1=order.indexOf(item);
        			if(of)
        			{
        				order.remove(item);
        				cost=cost-pric.remove(f1);
        				plate.remove(f1);
        			}
        		}
        		if(f==3)
        		{
        			item="Dahi Puri";
        			boolean of=order.contains(item);
        			int f1=order.indexOf(item);
        			if(of)
        			{
        				order.remove(item);
        				cost=cost-pric.remove(f1);
        				plate.remove(f1);
        			}
        		}
        		if(f==4)
        		{
        			item="Sev Puri";
        			boolean of=order.contains(item);
        			int f1=order.indexOf(item);
        			if(of)
        			{
        				order.remove(item);
        				cost=cost-pric.remove(f1);
        				plate.remove(f1);
        			}
        		}
        		if(f==5)
        		{
        			item="Bhel Puri";
        			boolean of=order.contains(item);
        			int f1=order.indexOf(item);
        			if(of)
        			{
        				order.remove(item);
        				cost=cost-pric.remove(f1);
        				plate.remove(f1);
        			}
        		}
        		System.out.println("Continue to delete the order(Yes/No)");
        		v=o.next();
        		}
        	}while(v!="No");
        	System.out.println();
        	System.out.println("Item Names\t\t\tNo. of plates\t\tSub total");
            it=order.iterator();
            i1=pric.iterator();
            i2=plate.iterator();
            int scost=0;
            while(it.hasNext() && i1.hasNext() && i2.hasNext())
            {
                 System.out.println(it.next()+"\t\t\t"+i2.next()+"\t\t\t"+i1.next());
                 System.out.println();
            }
            System.out.println();
            System.out.println("Total Bill:\t\t\t     \t\t\t"+cost);
        }
        else
        {
        	System.out.println("Item Names\t\t\tNo. of plates\t\tSub total");
            it=order.iterator();
            i1=pric.iterator();
            i2=plate.iterator();
            while(it.hasNext() && i1.hasNext() && i2.hasNext())
            {
                 System.out.println(it.next()+"\t\t\t"+i2.next()+"\t\t\t"+i1.next());
                 System.out.println();
            }
            System.out.println();
            System.out.println("Total Bill:\t\t\t     \t\t\t"+cost);
        }
        System.out.println("Thank you for ordering from java hotel "+name+"!");
	}
}
