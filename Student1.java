import java.util.Scanner;
public class Student1 
{
    private String studentName;
    private String rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;
    public Student(String studentName,String rollNumber,double marks,String courseName,int courseCredits)
    {
        this.studentName=studentName;
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.courseName=courseName;
        this.courseCredits=courseCredits;
    }
    public boolean checkEligibility()
    {
        return marks>=50;
    }
    public double calcullateScholarship()
    {
        double fee=calculateFee();
        if(marks>=85)
        {
            return fee*0.20;
        }
        else if(marks>=70)
        {
            return fee*0.10;
        }else{
            return 0.0;
        }
    }
    public double calculateFinalFee()
    {
        return calculateFee()-calcullateScholarship();
    }
    public void displayDetails()
    {
        System.out.println("\n--- Student Registration Detais ---");
        System.out.println("Student Name:"+studentName);
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Marks:"+marks);
        System.out.println("Course Name:"+courseName);
        System.out.println("Course Credits:"+courseCredits);
        System.out.println("Eligibility:"+Eligibility);
        System.out.println("Total Fee: Rs."+calculateFee());
        System.out.println("Scholarship: Rs."+calcullateScholarship());
        System.out.println("Final Fee: Rs."+calculateFinalFee());
    }
}
public class Main1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name=sc.nextLine();
        System.out.print("Enter Roll Number:");
        String rollNumber=sc.nextLine();
        System.out.print("Enter Marks:");
        double marks=sc.nextDouble();
        System.out.print("Enter Course Name:");
        String courseName=sc.nextLine();
        System.out.print("Enter Course Credits:");
        int credits=sc.nextInt();
        Student student=new Student(name,rollNumber,marks,courseName,credits);
        if(student.checkEligibility())
        {
            student.displayDetails();
        }else{
            System.out.println("\nStudent is not eligible for registration(Marks are below 50).");
        }
        sc.close();
    }
}
