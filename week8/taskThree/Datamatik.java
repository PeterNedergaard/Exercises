class Datamatik{
	public static void main(String[] args){
		Teacher teacher1 = new Teacher("Jesper", 83, false);
		Student student1 = new Student("Peter", 20, false, "3");
		Student student2 = new Student("Christian", 19, false, "3");

		System.out.println(teacher1.name);

		System.out.println(student1.name + " " + student1.datamatikerTeam);
		System.out.println(student2.name + " " + student2.datamatikerTeam);
	}

}