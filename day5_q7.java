// 7. Create two interfaces Academic and Sports. Academic should contain a method academicScore() and Sports should contain 
// a method sportsScore(). Create a class Student that implements both interfaces and calculates the overall score by combining
//  the academic and sports scores.
interface  Academic{
void academicScore();
}
interface Sports{
    void sportsScore();
}
class Student implements Academic,Sports{
    int academic;
    int sports;

    Student(int academic, int sports) {
        this.academic = academic;
        this.sports = sports;
    }

    public void academicScore() {
        System.out.println("Academic Score: " + academic);
    }

    public void sportsScore() {
        System.out.println("Sports Score: " + sports);
    }

    void display() {
        int overall = academic + sports;
        System.out.println("Overall Score: " + overall);
    }
}
public class day5_q7 {
    public static void main(String[] args) {
        Student s = new Student(80, 70);

        s.academicScore();
        s.sportsScore();
        s.display();
    }
}
