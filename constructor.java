class Student{
    String name;
    int age;
// default constructor
Student(){
name="AMAN";
age = 20;
}
//parameterized constructor
Student(String a,int b){
name = a;
age = b;
}
//copy constructor 
Student(Student xyz){
    name = xyz.name;
    age = xyz.age;
}

}
class constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("name = "+s1.name+" age = "+s1.age);
        Student s2 = new Student("GAUTAM",20);
        System.out.println("name = "+s2.name+" age = "+s2.age);
        Student s3 = new Student(s2);
        System.out.println("name = "+s3.name+" age = "+s3.age);
    }
}