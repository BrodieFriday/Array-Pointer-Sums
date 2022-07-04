import java.util.Scanner;
public class ArrayPointerSums {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int counter = 1;
			System.out.print("Enter your test number: ");
			int testNumber = sc.nextInt();
			System.out.print("Enter the size of your array: ");
			System.out.println();
			int size = sc.nextInt();
			int[] array = new int[size];
			for(int i = 0; i < array.length; i++) {
				System.out.print("Enter number " + counter + " of your array: ");
				int fillArray = sc.nextInt();
				array[i] = fillArray;
				counter++;
			}
			
			for(int i = 0; i < array.length; i ++) { // Pointer 'i' only increments when pointer 'k' reaches the end of the array
				for(int k = 1; k < array.length; k++) { // Pointer 'k' increments to the end of the array
					if(array[i] + array[k] == testNumber && array[i] != array[k]) { // Checks every possible match to see if 'i' + 'k' = testNumber
						System.out.println(true);
						System.exit(0);
					}
				}
				if(i == array.length-1) { // If 'i' reaches the end of the array it will print false
					System.out.println(false);
				}
			}
		}
		
		
	
	}

}
