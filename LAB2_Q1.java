import java.util.Scanner;
public class LAB2_Q1 {
    String name;
    int rno;
    double mark1, mark2, mark3;

void read(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name :");
name = sc.nextLine();    
System.out.println("Enter registration number :");
rno = sc.nextInt();    
System.out.println("Enter your subject1 marks :");
mark1 = sc.nextDouble();    
System.out.println("Enter your subject2 marks :");
mark2 = sc.nextDouble();    
System.out.println("Enter your subject3 marks :");
mark3 = sc.nextDouble();    
}

void display(){
    System.out.println("name : "+ name);
    System.out.println("registration number is "+rno);
    System.out.println("subject 1 marks = "+mark1);
    System.out.println("subject 2 marks = "+mark2);
    System.out.println("subject 3 marks = "+mark3);
}

void average(){
    double avg = (mark1 + mark2 + mark3)/3.0;
    System.out.println("Average is "+ avg);
}

}
//main class
class Main{
    public static void main(String[] args) {
        LAB2_Q1 a = new LAB2_Q1();
        a.read();
        a.display();
        a.average();
    }
}
