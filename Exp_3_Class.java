import java.lang.String;
import java.util.Scanner;
class Student{
   String name;
   int Roll_no;
   int Marks_1=0,Marks_2=0,Marks_3=0,Marks_4=0;
  void getInfo(){
     Scanner a=new Scanner(System.in); 
     System.out.print("Enter your Name ");
     name=a.nextLine();
     System.out.print("Enter your roll no ");
     Roll_no=a.nextInt();
     System.out.print("Enter your marks in 1st Subject ");   
     Marks_1=a.nextInt();
     System.out.print("Enter your marks in 2nd Subject ");   
     Marks_2=a.nextInt();
     System.out.print("Enter your marks in 3rd Subject ");   
     Marks_3=a.nextInt();
     System.out.print("Enter your marks in 4th Subject ");   
     Marks_4=a.nextInt();
  }
  void printInfo(){
     System.out.println("Your name is "+name);
     System.out.println("Your roll no. is  "+Roll_no);
     System.out.println("You got "+Marks_1+" marks in 1st Subject ");
     System.out.println("You got "+Marks_2+" marks in 2nd Subject "); 
     System.out.println("You got "+Marks_3+" marks in 3rd Subject ");
     System.out.println("You got "+Marks_4+" marks in 4th Subject ");
  }
}
class Exp_3_Class{
  public static void main(String[] args){
     Student stu=new Student();
     stu.getInfo();  
     stu.printInfo();
  }
}

  
