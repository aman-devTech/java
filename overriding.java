class Animal {
    void eat() {
        System.out.println("Eating.........");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("meri marzi");
    }
}

class overriding {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.eat();
    }
}
