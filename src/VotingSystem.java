
public class VotingSystem {

	public static void main(String[] args) {

		Person p1 = new Person("Viral", "Male", 25);
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
				System.out.println(e.getMessage());

			}
		}
	}
}
