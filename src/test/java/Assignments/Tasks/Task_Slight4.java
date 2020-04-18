package Assignments.Tasks;

public class Task_Slight4 {
	
	public static void main(String[] args) {
		
		
		
		
		String days = "week days";
		
		switch(days) {
		
		case "week days":
			System.out.println("Monday");
			System.out.println("Tuesday");
			System.out.println("Wednesday");
			System.out.println("Thursday");
			System.out.println("Friday");
			System.out.println("Saturday");
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("Invalid");
				break;
			
		}
		
		
		System.out.println("=======================");
		
		
		char ch = 'A'; 
		
		switch(ch) {
		
		case 'A':
		case 'B':	
		case 'C':
		case 'D':
		case 'E':
			System.out.println("found");
			break;
		
			default :
				System.out.println("not found");
				
		}
		
		System.out.println("=======================");
		
		
		
		
		
		
	}

}
