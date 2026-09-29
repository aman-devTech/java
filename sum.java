public class sum {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = a+b;
        System.out.println("Sum is " + sum);
        System.out.println("Before swap a = "+ a + " b = " + b);
        int temp = a;
        a=b;
        b = temp;
        System.out.println("Before swap a = "+ a + " b = " + b);
        int c = 25;
        int largest;
        if(a>b && a>c)
            largest = a;
        else if(b>c && b>a)
            largest=b;
        else
            largest = c;
        System.out.println("Largest integer among three is "+ largest);
        //print prime from 1 to 20
        
        for(int j =2 ;j<=20;j++){
            boolean prime=true;
        for(int i = 2; i < j;i++){
            if(j%i == 0){
                prime=false;
                break;
            }
           
        }
        if(prime)
            System.out.println(j );
    }
        
    }    
}
