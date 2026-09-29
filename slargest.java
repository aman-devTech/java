public class slargest {
    public static void main(String[] args){
        int[] arr = {10,8,64,63,5};
        int largest = -1;
        int slargest = -1;
        for(int i= 0; i< 5 ; i++){
            if(arr[i]>largest && arr[i]>slargest){
                slargest = largest;
                largest= arr[i];
            
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);
    }
}
