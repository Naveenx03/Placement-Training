import java.util.Arrays;
public class max
{
	public static void main(String[] args) {
		int arr[] = {7,1,3,4,10};
        int max = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("First max");
        System.out.println(max);
        System.out.println("second max");
        Arrays.sort(arr);
        System.out.println(arr[arr.length -2]);
        System.out.println("Third max");
        Arrays.sort(arr);
        System.out.println(arr[arr.length -3]);
        
        
	}
}