package cart;


	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

	public class Products {

		
		static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		static String st;
		private static String x;
		private static int y;
		private static int z;
		 private static int total=0;
		//static String yn;
		
		public static int getZ() {
			return z;
		}
		public static void setZ(int z) {
			Products.z = z;
		}
		public static int getY() {
			return y;
		}
		public static void setY(int y) {
			Products.y = y;
		}
		public String getX() {
			return x;
		}
		public void setX(String x) {
			this.x = x;
		}
	  void products()throws IOException{
			
		       ArrayList<String> sr=new ArrayList<String>();
		         sr.add("ladies-wear");
		         sr.add("men-wear");
		         sr.add("kids-wear");
		         sr.add("accessories");
	             System.out.println("products...........list");
		         Iterator<String> l= sr.iterator();
		          int i=0;
		          while(l.hasNext()){	
			     System.out.println(i+1+"-"+l.next());
			       i++;
		                     }
	System.out.println("select the products you want to shop");
	int a=Integer.parseInt(br.readLine());
	switch(a){
	case 1:System.out.println("welcome to ladies shopping");
	         ladies();
	         break;
	case 2:System.out.println("welcome to men-wear");
	         mens();
	         break;
	case 3:System.out.println("welcome to kids-wear");
	        kidsWear();
	         break;
	case 4:System.out.println("welcome to accessories");
	         accessories();
	         break;
	default:System.out.println("invalid process");
	                
	       }  

	}
	 void ladies()throws IOException
	{   
		boolean choice=true;
		  while(choice){ 
		Hashtable<String, Integer> b=new Hashtable<String, Integer>();
	    b.put("LEGGINGS",  new Integer (20));
	    b.put("PANTS",     new Integer (20));
	    b.put("JACKETS",   new Integer (20));
	    b.put("KURTHIES",  new Integer (20));
	    System.out.println(" Stock value: "+b);
	    System.out.println("enter your ITEMS");
	   
	    x=br.readLine();
	    
	    System.out.println("enter your quantity");
	    y=Integer.parseInt(br.readLine());
	    System.out.println(x+ ": ITEMS ARE ADDED INTO THE CARTS  "+y);
	    System.out.println("ENTER THE AMOUNT OF THE ITEM");
	    z=Integer.parseInt(br.readLine());
	   int bal=((Integer)b.get(x)).intValue();
	   b.put(x,new Integer(bal-y));   
	   System.out.println("Initial hash table value: "+b);
       System.out.println("items\tquality\tprice");
	   for(Map.Entry m:b.entrySet()){  
       System.out.println(m.getKey()+"\t"+m.getValue());
	   }
	   System.out.println("Do you want to go to Ladies Shopping Enter your choice y/n");//
	  char choose=(char) br.read();
       if(choose=='n')
    	   choice=false;
      }
      
	}
	   
		void mens()throws IOException
		{   
			Hashtable<String, Integer> b=new Hashtable<String, Integer>();
		    b.put("SHIRTS",  new Integer (20));
		    b.put("TSHIRTS", new Integer (20));
		    b.put("SHOES",   new Integer (20));
		  
		    System.out.println("Initial hash table value: "+b);
		    System.out.println("enter your ITEMS");
		    x=br.readLine();
		    System.out.println("enter your quantity");
		    y=Integer.parseInt(br.readLine());
		    System.out.println(x+ " ITEMS ARE ADDED INTO THE CARTS  "+y);
		    System.out.println("ENTER THE AMOUNT OF THE ITEM");
		    z=Integer.parseInt(br.readLine());
		    int bal=((Integer)b.get(x)).intValue();

		      b.put(x,new Integer(bal-y));
		      
		   System.out.println("Initial hash table value: "+b);
		   System.out.println("items\t\tqualityprice");

	       for(Map.Entry m:b.entrySet()){  
	       	   System.out.println(m.getKey()+" "+m.getValue());}
		   }
		 void kidsWear()throws IOException
		{   
			Hashtable<String, Integer> b=new Hashtable<String, Integer>();
		    b.put("FROCKS", new Integer (20));
		    b.put("SKIRT",  new Integer (20));
		    b.put("TOYS",   new Integer (20));
		    b.put("DOLLS",  new Integer (20));
		    System.out.println("Initial hash table value: "+b);
		    System.out.println("enter your ITEMS");
		    x=br.readLine();
		    System.out.println("enter your quantity");
		    y=Integer.parseInt(br.readLine());
		    System.out.println(x+ " ITEMS ARE ADDED INTO THE CARTS  "+y);
		    System.out.println("ENTER THE AMOUNT OF THE ITEM");
		    z=Integer.parseInt(br.readLine());
		    int bal=((Integer)b.get(x)).intValue();
            b.put(x,new Integer(bal-y));
		    System.out.println("Initial hash table value: "+b);
		    System.out.println("items\t\tquality");

	       for(Map.Entry m:b.entrySet()){  
	       	   System.out.println(m.getKey()+" "+m.getValue());}
		   
		   }
		void accessories()throws IOException
		{   
			Hashtable<String, Integer> b=new Hashtable<String, Integer>();
		    b.put("EAR-RINGS",  new Integer (20));
		    b.put("SHOES",      new Integer (20));
		    b.put("BELTS",      new Integer (20));
		    b.put("TOYS",       new Integer (20));
		    //System.out.println("Initial hash table value: "+b);
		    System.out.println("enter your ITEMS");
		    x=br.readLine();
		    System.out.println("enter your quantity");
		    y=Integer.parseInt(br.readLine());
		    System.out.println(x+ " ITEMS ARE ADDED INTO THE CARTS  "+y);
		    System.out.println("ENTER THE AMOUNT OF THE ITEM");
		    z=Integer.parseInt(br.readLine());
		   
		    int bal=((Integer)b.get(x)).intValue();

		    b.put(x,new Integer(bal-y));
		      
		    System.out.println("Initial hash table value: "+b);
	        System.out.println("items\t\tquality");

	        for(Map.Entry m:b.entrySet()){  
	        	   System.out.println(m.getKey()+" "+m.getValue());}

	        }
		
	}
	
	

	
