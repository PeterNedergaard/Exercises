import java.util.Arrays;

class Main{
	public static void main(String[] args){
		int[] intArray = {10,20,30};
		String[] stringArray = {"ten","twenty","thirty"};
		boolean[] booleanArray ={true,false,true};
		int[] intMessArray = {5,1,8,25,28,9,51,2,7,43,12,11,71};

		printStrings(stringArray);
		

		System.out.println(sumOfAllInts(intArray));
		System.out.println(averageOfAllInts(intArray));
		System.out.println(Arrays.toString(sortArray(intMessArray)));

	}

	public static void printStrings(String[] strings){
		for(String string : strings){
			System.out.println(string);
		}
	}

	public static int sumOfAllInts(int[] arrayOfInts){
		int sum = 0;
		for(int numb : arrayOfInts){
			sum += numb;
		}
		return sum;
	}

	public static int averageOfAllInts(int[] arrayOfInts){
		int average = 0;
		int sum = 0;
		for(int numb : arrayOfInts){
			sum += numb;
		}
		average = sum/arrayOfInts.length;
		return average;
	}

	//Sorting an array from lowest to highest value, can be done using the sort() method after importing java.util.Arrays
	public static int[] sortArray(int[] arrayOfInts){
		Arrays.sort(arrayOfInts);
		return arrayOfInts;
	}

}