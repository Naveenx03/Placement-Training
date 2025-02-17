public class ConsecutiveNum
{
	public static void main(String[] args) {
	int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
	int count = 0;
	int prev = 0;
	for(int i=0; i<arr.length; i++){
    if(arr[i] == 1){
        prev++;
        if (prev>count){
            count = prev;
        }
    }
    else{
        prev = 0;
    }
	}
	System.out.println("consecutive 1s");
	 System.out.println(count);
}
}