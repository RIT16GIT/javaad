package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestandLargest {

	public static void main(String[] args) {
		
		int numbers[]= {-10,24,50,-88,-70,9876};
		
		int largest = numbers[0];
		int smallest =numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if (numbers[i]>largest) {
			
			largest=numbers[i];
		}
		else if(numbers[i]<smallest){
			smallest = numbers[i];
		}

		}
	
		System.out.println("Array list"+ Arrays.toString(numbers));
		System.out.println("Largest::" + largest);
		System.out.println("Smallest::" + smallest);
		
	}

}
