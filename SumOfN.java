public class SumOfN{
    public static void main(String [] args){
        int arr[] = {3,4,5,6,7,8};
        int sum = 0;
        int total = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        String numStr = String.valueOf(sum);
        int[] sum_arr = new int[numStr.length()];

        // Fill the array with digits
        for (int i = 0; i < numStr.length(); i++) {
            sum_arr[i] = numStr.charAt(i) - '0'; // Convert char to int
        }
       total = sum_arr[0] + sum_arr[1];
       System.out.println("Sum");
       System.out.println(sum);
       System.out.println("Final sum");
       System.out.println(total);
    }
}