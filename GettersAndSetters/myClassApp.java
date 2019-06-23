import java.util.Scanner;

class myClassApp {

    public static void main (String [] args){
    myClass mClass = new myClass();
    mClass.myMethod();
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name? ");
    String myName = input.nextLine();
    mClass.name= myName;
    System.out.println(mClass.name);
    }
}