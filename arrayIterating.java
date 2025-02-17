public class arrayIterating {
    public static void main(String s[]){
        int arr[] = {1,2,3,4,5};
        int i;
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("");
        for(int j:arr){
            System.out.println(j);
        }
        System.out.println("");
        int k;
        for(k=arr.length-1; k>=0; k--){
            System.out.println(arr[k]);
        }
    }
}

