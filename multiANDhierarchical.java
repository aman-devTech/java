class car{
    void wheel(){
        System.out.println("has four wheels");
    }
}
class flyingcar extends car{
    void fly(){
        System.out.println("can also fly");
    }
}
class maruti extends car{
    void comfort(){
        System.out.println("best for comfort.");

    }
}
class bmw extends maruti{
    void luxury(){
        System.out.println("Is the best among luxurious cars.");
    }
}
class multiANDhierarchical {
    public static void main(String[] args) {
        flyingcar f = new flyingcar();
        maruti m = new maruti();
        bmw b = new bmw();
        // hierarchical
        f.wheel();
        f.fly();
        m.wheel();
        m.comfort();
        // multilevel
        b.wheel();
        b.comfort();
        b.luxury();
    }
}
