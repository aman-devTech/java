import java.util.Scanner;
public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int size = sc.nextInt();

        // create an a array
        int[] arr = new int[size];

        System.out.println("Enter "+ size + " integers");
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        //print before 
        System.out.println("Before");
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        // core logic
        for(int i=0 ; i< size-1 ; i++){
            for(int j=0; j<size -i -1; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //after 
        System.out.println("after");
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" " );
        }
    }
}
