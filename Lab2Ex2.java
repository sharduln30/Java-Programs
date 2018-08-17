import java.io.*;
class Lab2Ex2
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name = null ; 
int age = 0; 
double marks_in_phy=0.0; 
double marks_in_chem=0.0; 
double marks_in_maths=0.0; 
double average_marks = 0.0;
String final_grade = null;
System.out.println(" Enter Name of Student : ");
name = br.readLine();
System.out.println(" Enter Age of Student : ");
age = Integer.parseInt(br.readLine());
System.out.println("Enter Marks in Physics : " );
marks_in_phy=Double.parseDouble(br.readLine());
System.out.println("Enter Marks in Chemistry : " );
marks_in_chem=Double.parseDouble(br.readLine());
System.out.println("Enter Marks in Maths : " );
marks_in_maths=Double.parseDouble(br.readLine());

average_marks = (marks_in_phy + marks_in_chem + marks_in_maths) / 3.0;
if (average_marks >= 90.00)
final_grade = "A++";
else
if (average_marks < 90.00 && average_marks >= 80.00)
final_grade = "A+";
else
if (average_marks < 80.00 && average_marks >= 70.00)
final_grade = "A";
else
if (average_marks < 70.00 && average_marks >= 60.00)
final_grade = "B++";
else
if (average_marks < 60.00 && average_marks >= 50.00)
final_grade = "B+";
else
if (average_marks < 50.00 && average_marks >= 40.00)
final_grade = "B";
else
if (average_marks < 40.00 && average_marks >= 35.00)
final_grade = "C";
else
final_grade = "Fail";

System.out.println(" Name of Student : " + name);
System.out.println(" Age of Student : " + age);
System.out.println(" Marks in Physics : " + marks_in_phy);
System.out.println(" Marks in Chemistry : " + marks_in_chem);
System.out.println(" Marks in Maths : " + marks_in_maths);
System.out.println(" Average Marks : " + average_marks);
System.out.println(" Final Grade : " + final_grade);
}
}