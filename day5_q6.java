// 6. Write a program to implement multiple inheritance in Java using interface.
interface Student {
    void study();
}

interface Athlete {
    void run();
}

class StudentAthlete implements Student, Athlete {

    public void study(){
        System.out.println("studies........");
    }
    public void run(){
        System.out.println("runs as well........");
    }
}


public class day5_q6 {
    public static void main(String[] args) {
        StudentAthlete a = new StudentAthlete();
        a.study();
        a.run();
    }
}
