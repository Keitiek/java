package ee.tthk.TARpe17;

public class StudentTester {

	public static void main(String[] args) {
		// constructor
		Student keiti = new Student();
		keiti.setStudentId(1);
		keiti.setName("keiti");
		keiti.setSsh("123-45-6789");
		keiti.setGpa(5.0);
		System.out.println(keiti);
		Student karel = new Student(12,"karel","123-45-6789",4.3 );
		System.out.println(karel);
		Student uku = karel;
		uku.setName("uku");
		System.out.println(karel);
		System.out.println(uku);
		

	}

}
