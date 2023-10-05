package safprogram;
import java.util.Scanner;


public class safprogram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("0:Sh20 (30mins,3hrs)");
		System.out.println("1:Sh10 (15Mins,1hr");
		System.out.println("2:Sh20 (15Mins,midnight)");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		System.out.println("7:Okoa 20 (900MB, 1hr)");
		System.out.println("8:Okoa Internet");
		System.out.println("98:More");
				System.out.println("\nEnter your option:");
		int option=scanner.nextInt();
		
        switch(option) {
         case 0:
    	      System.out.println("\n9:Okoa Minutes");
	          System.out.println("10:Okoa SMS");
		   	  System.out.println("11:Lipa Okoa");
			  System.out.println("#Check Balance");
		      System.out.println("0:Back");
    		int option1=scanner.nextInt();
    		switch (option1) {
    		case 0:
    			System.out.println("\n0:Sh20 (30mins,3hrs)");
    			System.out.println("1:Sh10 (15Mins,1hr");
    			System.out.println("2:Sh20 (15Mins,midnight");
    			System.out.println("3:Okoa 50");
    			System.out.println("4:Okoa 20");
    			System.out.println("5:Okoa 10");
    			System.out.println("6:Okoa 5");
    			System.out.println("7:Okoa 20 (900MB, 1hr");
    			System.out.println("8:Okoa Internet");
    			System.out.println("98:More");
    			
    		}
        	
        	
        	
        }
	}

}
