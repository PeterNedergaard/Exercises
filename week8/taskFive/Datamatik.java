import java.util.Random;

class Datamatik{	
	
	

	public static void main(String[] args){
		Random rand = new Random();
		int low = 18;
		int high = 50;
		int result;

		Student students[] = new Student[10];
		String[] arrayOfNames = {"Jens","Hans","Mahmoud","Rasmus","Abdul","George","Helle","Abdi","Kim","Lene"};

		for(int i = 0; i < students.length; i++){
			result = rand.nextInt(high-low) + low;

			students[i] = new Student(arrayOfNames[i],result,i);
		}

		System.out.println(printStudentInfo(students,4));
		System.out.println(printStudentInfo(students,"Rasmus"));

	}

	public static String printStudentInfo(Student[] nameArray, int indexNum){
		return nameArray[indexNum].name;
	}

	public static int printStudentInfo(Student[] nameArray, String nameToFind){
		int indexNum = -1;
		for(int i = 0; i < nameArray.length; i++){
			if(nameArray[i].name == nameToFind) indexNum = i;
		}
		return indexNum;
	}
}