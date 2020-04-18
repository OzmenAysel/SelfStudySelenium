package Assignments.Tasks;

public class Task_slight2 {
	
	public static void main(String[] args) {
		
		int AppleCount = 20 ;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = AppleCount < OrangesCount || OrangesCount >= PearsCount;
		//								 false 	 || 	true
		//										true
		 
		System.out.println(comp);
		
		
		
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree = 70;
		boolean comp2 = ( ! ( OutsideWeather=="Rainy"||Degree==70 ));
		//								      !(false||true)
		//										   !true
		//										   false							
		
		System.out.println(comp2);
		
		
		
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b ==2;
		//               false ||	true   &&	false
		//				  false||false
		//					  false
		
		System.out.println(res);
		
		
		
		
		boolean x = true, z = true;
		int y = 20;
		x = (y!=20)||(z=false);
		//	   false||false
		//		  false
		 
		 System.out.println(x);
		
		
		
		
	}

}
