class Animal {
    void eat() {
        System.out.println("Can eat.");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("dog barks");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.eat();
        a.barks();
    }
}