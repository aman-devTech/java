import java.util.Scanner;
public class mathclass {
    public static void main(String[] args) {
        // double result;
        // result = Math.pow(2,3); 
        // result = Math.abs(-8);
        // result = Math.sqrt(16);
        // result = Math.round(3.5);
        // result = Math.max(500,501);
        // result = Math.min(500,501);

        // System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        double b,p,h;
        System.out.println("ENTER THE BASE:");
        b=scanner.nextDouble();
        System.out.println("ENTER THE PERPENDICULAR:");
        p=scanner.nextDouble();
        h = Math.sqrt((b*b+p*p));
        System.out.println("hypotaneous is :"+h);
        scanner.close();
    }
    
}
