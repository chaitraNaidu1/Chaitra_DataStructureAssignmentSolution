package gl.driver;

import java.io.IOException;
import java.util.Scanner;

import gl.Service.Service;

public class Driver {
	public static void main(String[] args)throws IOException{
	
      int noOfFloor;
      int[] floors;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the total number of floors in the building");
       
      noOfFloor=sc.nextInt();
      floors=new int[noOfFloor];
      
    	  for(int i=0;i<noOfFloor;i++) {
    		 System.out.println("The number of floors given on day 1 " + i+1);
    		 floors[i]=sc.nextInt();
    	  }
        System.out.println();
        Service service=new Service();
        service.printConstructionTable(floors);
}
}

        
      
     
      
	

