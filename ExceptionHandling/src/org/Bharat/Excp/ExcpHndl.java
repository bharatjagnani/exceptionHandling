package org.Bharat.Excp;

public class ExcpHndl {

	public static void main(String[] args) {
          System.out.println("Hello");
          //int j =10/0;
          try{
        	  System.out.println("Hello1");
        	  try{
        	  int i = 10/0;
        	  }catch(NullPointerException e){
        		  System.out.println("Hello6");
        	  }
        	  
        	  System.out.println("Hello5");
          }catch(NullPointerException e){
        	  System.out.println("Hello2");
          }finally{
        	  System.out.println("Hello4");
          }
          System.out.println("Hello3");
	}

}
