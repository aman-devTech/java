class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee() {
        System.out.println("default constructor");
    }

    Employee(int id, String name, String dep, double sal) {
        this.id = id;
        this.name = name;
        this.department = dep;
        this.salary = sal;
    }

    // getter methods
    int get_id() {
        return id;
    }

    String get_name() {
        return name;
    }

    String get_dep() {
        return department;
    }

    double get_salary() {
        return salary;
    }

    // method to display details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {

        Manager[] managers = new Manager[3];
    
        managers[0] = new Manager(101, "Aman", "CSE", 50000, 10000);
        managers[1] = new Manager(102, "Rahul", "IT", 60000, 5000);
        managers[2] = new Manager(103, "Rohit", "ECE", 45000, 20000);
    
        double max = 0;
        Manager highest = null;
    
        for (int i = 0; i < managers.length; i++) {
    
            double total = managers[i].totalSalary();
    
            if (total > max) {
                max = total;
                highest = managers[i];
            }
        }
    
        System.out.println("\nManager with Maximum Total Salary:");
        highest.display();
    }
}

class Manager extends Employee {
    private double bonus;

    // Parameterized constructor
    Manager(int id, String name, String department,double salary, double bonus) {
    super(id, name, department, salary);
    this.bonus = bonus;
    }

    double totalSalary(){
        return (get_salary()+bonus);
    }

    // method to display details
    void display() {
        System.out.println("ID: " + get_id());
        System.out.println("Name: " + get_name());
        System.out.println("Department: " + get_dep());
        System.out.println("Salary: " + get_salary());
        System.out.println("Bonus: " + bonus);
        System.out.println("Total " + totalSalary());
    }
}
