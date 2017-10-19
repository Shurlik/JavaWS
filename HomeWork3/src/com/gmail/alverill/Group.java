package com.gmail.alverill;

import java.util.Arrays;

public class Group {
	private String groupName;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}

	private Student[] studentGroup = new Student[10];

	public void getInfo() {
		for (Student student : studentGroup) {
			System.out.println(student);
		}
	}

	private boolean groupSize() {
		int count = 0;
		for (Student student : studentGroup) {
			if (student != null) {
				count += 1;
			}
		}
		if (count < 10) {
			return true;
		} else {
			return false;
		}

	}

	public void addStudent(Student student) throws FullGroupException {
		if (!groupSize()) {
			throw new FullGroupException();
		} else {
			for (int i = 0; i < studentGroup.length; i += 1) {
				if (studentGroup[i] == null) {
					studentGroup[i] = student;
					System.out.println("Student " + student.getFirstName() + " " + student.getSecondName()
							+ " successfully added to group " + this.groupName + ".");
					break;
				}
			}
		}
	}

	public void remStudent(String firstName) {
		for (int i = 0; i < studentGroup.length; i += 1) {
			if (studentGroup[i] != null && studentGroup[i].getFirstName() == firstName) {
				System.out.print("The " + studentGroup[i].getFirstName() + " " + studentGroup[i].getSecondName()
						+ " from group " + this.groupName + "...");
				studentGroup[i] = null;
				System.out.println(" Removed successfully!");

				break;
			} else {
				if (i == 9) {
					System.out.println("Sorry, can't find this student.");

				}
			}
		}

	}

	public void findStudent(String firstName) {
		for (int i = 0; i < studentGroup.length; i += 1) {
			if (studentGroup[i] != null && studentGroup[i].getFirstName() == firstName) {
				System.out.println("Yes, the " + studentGroup[i].getFirstName() + " " + studentGroup[i].getSecondName()
						+ " in group " + this.groupName + ".");
				break;
			} else {
				if (i == 9) {
					System.out.println("Sorry, can't find this student.");
				}

			}

		}
	}

	@Override
	public String toString() {
		Arrays.sort(studentGroup, (a, b) -> Chekker.chekker(a, b) != Chekker.chek ? Chekker.chekker(a, b)
				: a.getFirstName().compareTo(b.getFirstName()));
		return "Group [studentGroup=" + Arrays.toString(studentGroup) + "]";
	}

}
