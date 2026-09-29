class abc{
    static int a = 20;
    static int b;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+ a);
        System.out.println("b = "+b);
    }
    // static block
    static{
        b= 2*a;
    }
}
public class Static {

    public static void main(String[] args) {
        abc.meth(4);
    }
}