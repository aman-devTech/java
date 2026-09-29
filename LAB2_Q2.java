public class LAB2_Q2 {
    int employeeNumber;
    String employeeName;
    double basicSalary;
    double da, incomeTax,grossSalary, netSalary;

    LAB2_Q2(int id, String name, double paisa){
        employeeNumber = id;
        employeeName = name;
        basicSalary = paisa;
    }
    void calculation(){
        da = 0.52 * basicSalary;
        grossSalary = basicSalary + da;
        incomeTax = 0.3 * grossSalary;
        netSalary = grossSalary - incomeTax;
    }
    
        void display() {
    System.out.println("\n--- Employee Details ---");
    System.out.println("Employee ID: " + employeeNumber);
    System.out.println("Name: " + employeeName);
    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("DA: " + da);
    System.out.println("Income Tax: " + incomeTax);
    System.out.println("Net Salary: " + netSalary);
}
    
}
//main class
class Main{
    public static void main(String[] args) {
        LAB2_Q2 a= new LAB2_Q2(101, "AMAN", 50000);
        LAB2_Q2 b= new LAB2_Q2(102, "raj", 30000);
        LAB2_Q2 c= new LAB2_Q2(103, "AMANwa", 90000);
        a.calculation();
        a.display();
        b.calculation();
        b.display();
        c.calculation();
        c.display();
        
    }
}
