
public class VotingSystem {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setName("Viral"); 
		p1.setGender("Male");
		p1.setAge(25);
		
		p2.setName("Archana"); 
		p2.setGender("Female");
		p2.setAge(22);
		
		p3.setName("Bhautik"); 
		p3.setGender("Male");
		p3.setAge(17);
		
		Person[] array = {p1, p2, p3};
		
		for (int i=0; i<array.length; i++) {
			
			if(array[i].getAge()>18 && array[i].getGender()=="Male") {
				System.out.println(array[i]);
			}
			else if(array[i].getAge()<18) {
				System.out.println("Invalid Age");
			}
		}

	}

}
