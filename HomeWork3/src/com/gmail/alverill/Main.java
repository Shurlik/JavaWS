package com.gmail.alverill;

public class Main {

	public static void main(String[] args) {

		Student hum1 = new Student("Don","Joe",25, "KPI", "inform");
		Student hum2 = new Student("Pi", "Parker", 18, "KPI", "inform");
		Student hum3 = new Student("Don1","Joe1",25, "KPI", "inform");
		Student hum4 = new Student("Pi1", "Parker1", 18, "KPI", "inform");
		Student hum5 = new Student("Don2","Joe2",25, "KPI", "inform");
		Student hum6 = new Student("Pi2", "Parker2", 18, "KPI", "inform");
		Student hum7 = new Student("Don3","Joe3",25, "KPI", "inform");
		Student hum8 = new Student("Pi3", "Parker3", 18, "KPI", "inform");
		Student hum9 = null;
		Student hum10 = new Student("Pi4", "Parker4", 18, "KPI", "inform");
		Student hum11 = new Student("Don5","Joe5",25, "KPI", "inform");
		Student hum12 = new Student("Pi5", "Parker5", 18, "KPI", "inform");
		Group group = new Group("Tgroup");
		
		try {
		group.addStudent(hum1);
		group.addStudent(hum2);
		group.addStudent(hum3);
		group.addStudent(hum4);
		group.addStudent(hum5);
		group.addStudent(hum6);
		group.addStudent(hum7);
		group.addStudent(hum8);
		group.addStudent(hum9);
		group.addStudent(hum10);
				
		group.findStudent("Pi2");
		group.remStudent("Pi4");
		group.findStudent("Pi4");
		
		group.addStudent(hum11);
		group.addStudent(hum12);
		}
		catch (FullGroupException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println(group);
		}

	}

}
