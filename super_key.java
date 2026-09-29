class Animal{
    String type = "animal";
    Animal(String msg){
        System.out.println(msg);
    }
}
class Dog extends Animal{
    //super for invoking constructor
    Dog() {
        super("Super constructor called"); // a. Invoking super class constructor
    }
    void display(){
    System.out.println("Super member: "+super.type);
    }
}
class super_key{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}