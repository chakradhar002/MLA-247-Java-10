package chapter5;

class Utils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
    
    }
} 

public class GenericsDataTypes{
	public static void main(String ar[]) {
		
		Integer[] intArray = {1,2,3,4};
		Utils.printArray(intArray);
		String[] strArray = {"1","2","3","4"};
		Utils.printArray(strArray);
	}
	
}
 
 

