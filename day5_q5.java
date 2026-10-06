// 5. Write a Java program where the interface ‘vegetable’ declares two functions. The functions color() is used for finding
// the colour of the vegetables and whgrow() for finding where the vegetable grow: underground or above ground.
// The interface vegetable is implemented, for example, by four different classes: spinach, potato, onion and tomato. 
// Each class provides the implementation of both the functions.
interface vegetable{
    void color();

    
    void whgrow();
}
class spinach implements vegetable{
    public void color(){
        System.out.println("green");
    }
    public void whgrow(){
        System.out.println("underground");
    }
}
//potato
class potato implements vegetable{
    public void color(){
        System.out.println("brown");
    }
    public void whgrow(){
        System.out.println("underground");
    }
}
//onion
class onion implements vegetable{
    public void color(){
        System.out.println("pink or purple");
    }
    public void whgrow(){
        System.out.println("underground");
    }
}
//tomato
class tomato implements vegetable{
    public void color(){
        System.out.println("red");
    }
    public void whgrow(){
        System.out.println("above ground");
    }
}
class day5_q5{
    public static void main(String[] args) {
        vegetable v1 = new  spinach();
        v1.color();
        v1.whgrow();

        vegetable v2 = new potato();
        v2.color();
        v2.whgrow();

        vegetable v3 = new onion();
        v3.color();
        v3.whgrow();

        vegetable v4 = new tomato();
        v4.color();
        v4.whgrow();
    }
}