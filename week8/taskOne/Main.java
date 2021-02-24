class Main{
	public static void main(String[] args){
		emptyLine();
		printLine("This is a line");
		printNameAge("Peter",20);

	}

	public static void emptyLine(){
		System.out.println("");
	}

	public static void printLine(String line){
		System.out.println(line);
	}

	public static void printNameAge(String name, int age){
		System.out.println("My name is " + name + ", I am " + age + " years old");
	}
}