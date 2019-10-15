package ee.tthk.TARpe17;

public class Student {
	private int studentId;
	private String name;
	private String ssh;
	private double gpa;
	public final int SCHCODE = 34958;
	
	public Student(){
		
	}
	
	// constructor using fields
	public Student(int studentId, String name, String ssh, double gpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.ssh = ssh;
		this.gpa = gpa;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", ssh=" + ssh + ", gpa=" + gpa + ", SCHCODE="
				+ SCHCODE + "]"+super.toString();
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsh() {
		return ssh;
	}

	public void setSsh(String ssh) {
		this.ssh = ssh;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	

}
