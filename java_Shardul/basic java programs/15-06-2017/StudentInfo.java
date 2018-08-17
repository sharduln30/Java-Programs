import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
class StudentInfo{
	
		static String name;
		static String email;
		static String address;
		static String contact;
		static String rollNumber;
		static BufferedReader br;

	public static void main(String args[])throws IOException{

 		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter student's Info....");
		insertStudentInfo();
		displayStudentInfo();

 	}
	
	static void insertStudentInfo()throws IOException{
		  	
		 System.out.println("Enter student's name");
		 name=br.readLine();
		 System.out.println("Enter student's email");
		 email=br.readLine();
		 System.out.println("Enter student's address");
		 address=br.readLine();
		 System.out.println("Enter student's contact");
		 contact=br.readLine();
		 System.out.println("Enter student's roll number");
		 rollNumber=br.readLine();
}
	static void displayStudentInfo(){
	
		System.out.println("Student's name= "+name);
		System.out.println("Student's Email= "+email);
		System.out.println("Student's address= "+address);
		System.out.println("Student's contact= "+contact);
		System.out.println("Student's roll number= "+rollNumber);

	
	}
}	
