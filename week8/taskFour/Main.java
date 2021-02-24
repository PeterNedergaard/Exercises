class Main{
	public static void main(String[] args){
		int[] intArray = {10,20,30};
		String[] stringArray = {"ten","twenty","thirty"};
		boolean[] booleanArray ={true,false,true};

		printStrings(stringArray);
		

		System.out.println(sumOfAllInts(intArray));
		System.out.println(averageOfAllInts(intArray));
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

	/*public static int[] arrangeIntArray(int[] arrayOfInts){
		int[] tempArray = null
		int tempValue = 0;

		for(int numb : arrayOfInts){
			for(int numb2 : arrayOfInts){

				if(arrayOfInts[numb] > arrayOfInts[numb2]){
					tempArray[numb] = arrayOfInts[numb2]
				}
			}
		}
		return tempArray;
	}*/
}