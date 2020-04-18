package JavaPractice.officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEach_dayJump {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(18,72,19));
        SortingArrayListAsc(list);
    }
    
    public static void SortingArrayListAsc(List<Integer> list) { 
        for (int i = 0; i < list.size(); i++) {
            
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
                System.out.println(list);
               
            }
            System.out.println("---------------");
        }
       
    }

}
	
//	public static void main(String[] args) {
		
//		int[] arr = {1,2,3};
//		
//		// print 2,4,6
//	
//		arr [0]=2;
//		arr [1]=4;
//		arr [2]=6;
//		for(int each:arr) {
//			System.out.print(each+" ");
//		}
//		System.out.println();
//		
//		
//	          //OR
//		int[] arr2 = {1,2,3}; 
//		for(int each:arr2) {
//			System.out.print(each*2+" ");
//		}
//		System.out.println();
//		
//		
//		
//		System.out.println("===========================");
//		
//		
//		
//		// 5 day, jump 10 times
		
		
//		for(int day=0; day<=5; day++) {
//			System.out.println("day"+day);
//			for(int jump=1; jump<=10; jump++) {
//				System.out.print("jumping "+jump+" ");
//			}
//			System.out.println();
//		}
//		
//	}
//
//}
