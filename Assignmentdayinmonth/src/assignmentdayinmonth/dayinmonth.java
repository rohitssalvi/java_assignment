package assignmentdayinmonth;

import java.util.Scanner;

public class dayinmonth {
	public static void main(String[] args) {
		
		Scanner takeinput=new Scanner(System.in);
		
		System.out.println("Enter the Value of month:");
		int day=takeinput.nextInt();
		  
		switch (day) {
		case 1:
			System.out.println("there are 31 days");
			break;
			
        case 2:
        	System.out.println("there are 28 days");
			break;
        case 3:
        	System.out.println("there are 31 days");
			break;	
        case 4:
        	System.out.println("there are 30 days");
			break;
        case 5:
	        System.out.println("there are 31 days");
			break;
        case 6:
	        System.out.println("there are 30 days");
	        break;
        case 7:
	        System.out.println("there are 31 days");
	        break;
        case 8:
	        System.out.println("there are 31 days");
	        break;
        case 9:
	        System.out.println("there are 30 days");
	        break;
        case 10:
	        System.out.println("there are 31 days");
	        break;
        case 11:
	        System.out.println("there are 30 days");
	        break;
        case 12:
	        System.out.println("there are 31 days");
	        break;

		default:
			System.out.println("There are only 12 month in a year");
			break;
		}
		
		
	}

}
