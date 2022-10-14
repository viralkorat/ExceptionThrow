import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) {
		String g = null;
		String n = null;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		Person[] array = new Person[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter details");
			array[i] = new Person(n, g, a);
			String name = sc.next();
			String gender = sc.next();
			int age = sc.nextInt();

			array[i].setName(name);
			array[i].setGender(gender);
			array[i].setAge(age);

			try {
				if (age < 18) {

					throw new InvalidAgeException(name + " 's age is not valid");
				}
			} catch (InvalidAgeException e) {
				System.out.println("Custom Exception Thrown");
				System.out.println(e);

			}
		}
		for (int i = 0; i < 3; i++) {
			if (array[i].getAge() >= 18 && array[i].getGender().contentEquals("Male")) {
				System.out.println(array[i]);
			}
		}
	}
}


/*Person p1 = new Person("Viral", "Male", 25);
Person p2 = new Person("Archana", "Female", 22);
Person p3 = new Person("Bhautik", "Male", 17);

Person[] array = { p1, p2, p3 };

for (int i = 0; i < array.length; i++) {
	try {
		if (array[i].getAge() > 18 && array[i].getGender() == "Male") {
			System.out.println(array[i]);
		}

		else if (array[i].getAge() < 18) {
			throw new InvalidAgeException("Voter's age is not valid");
		}
	} catch (InvalidAgeException e) {
		System.out.println("Custom Exception Thrown");
		System.out.println(e.getMessage());*/