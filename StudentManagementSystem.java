import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private int roll_no;
    private String name;
    private double marks;
    Student(int roll_no,String name,double marks){
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
    }
    String getname(){
        return name;
    }
    int getroll_no(){
        return roll_no;
    }
    double getmarks(){
        return marks;
    }
}

public class StudentManagementSystem{
    ArrayList<Student> s= new ArrayList<>();
    public void addstudent(int roll_no, String name, double marks){
        Student students=new Student(roll_no,name,marks);
        s.add(students);
    }
    public void removestudent(int roll_no){
        for(int i=0;i<s.size();i++){
            if(s.get(i).getroll_no()==roll_no){
                s.remove(i);
                System.out.println("The "+roll_no+"is removed");
                return;
            }
        }
        System.out.println("Roll no not found...");
    }
    public void displayStudents(){
        System.out.println("======Student Records======");
        System.out.println("Rollno  Name    Marks");
        for(Student i:s){
            System.out.print(i.getroll_no()+"   ");
            System.out.print(i.getname()+"  ");
            System.out.print(i.getmarks()+" ");
            System.out.println();
        }
    }
    public void findstudent(int roll_no){
        for(int i=0;i<s.size();i++){
            if(s.get(i).getroll_no()==roll_no){
                 System.out.println("Name :"+s.get(i).getname());
                 System.out.println("Marks :"+s.get(i).getmarks());
                return;
            }
        }
        System.out.println("Roll no not found...");
    }
    public static void main(String[] args) {
        StudentManagementSystem sms=new StudentManagementSystem();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("=============Welcome===========");            
            System.out.println("|||Student Management System|||");
            System.out.println("1.Add Student");
            System.out.println("2.Remove Student");
            System.out.println("3.Find Student ");
            System.out.println("4.Display all Student");
            System.out.println("5.Exit");
            System.out.print("Enter your chocie: ");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter the Roll No. :");
                    int roll_no=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Name :");
                    String name=sc.nextLine();                    
                    System.out.println("Enter the Marks :");
                    double marks=sc.nextDouble();
                    sms.addstudent(roll_no, name, marks);
                    break;
                }
                case 2:{
                    System.out.println("Enter the Roll No. :");
                    int roll_no = sc.nextInt();
                    sms.removestudent(roll_no);
                    break;
                }
                case 3:{
                    System.out.println("Enter the Roll No. :");
                    int roll_no = sc.nextInt();
                    sms.findstudent(roll_no);
                    break;
                }
                case 4:{
                    sms.displayStudents();
                    break;
                }
                
                case 5:
                {   
                    System.out.println("Good bye..Have a good day..");
                    sc.close();
                    System.exit(0);
                }
                default:System.out.println("Wrong choice....");
            }
        }
    }
}