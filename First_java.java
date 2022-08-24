class Hello{
   public void tp(){
     System.out.println("I am Amogh ");
  }
}
class Age{
    int m=8,y=2022,c_age=0;
    public int agecal(int a,int c){
      if(a>m && y>c){
           c_age=y-c-1;
           System.out.println("Your age is "+c_age);
      }
      else
          c_age=y-c;
          System.out.println("Your age is "+c_age);
    return c_age;
          
   }
   
}
          



            
public class First_java{
   public static void main(String[] args){
          System.out.println("Hello World");
          Hello he=new Hello();
          he.tp();
          Age ag=new Age(); 
//parseInt converts String arguments to int 
          int argument1=Integer.parseInt(args[0]);
          int argument2=Integer.parseInt(args[1]);
          ag.agecal(argument1,argument2);
   }
}