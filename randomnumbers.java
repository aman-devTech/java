import java.util.Random;
public class randomnumbers {
    public static void main(String[] args) {
        // create an object
        Random random = new Random();
        int num1 = random.nextInt(1,101);// u can create double,boolean data types also
        int num2 = random.nextInt(1,101);
        int num3 = random.nextInt(1,101);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
