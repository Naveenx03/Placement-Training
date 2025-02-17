public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {3,2,3,2,1,9};
		for (int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int count = 0;
			for (int j=0; j<arr.length; j++) {
				if (temp == arr[j]) {
					count ++;
					if(count > 1) {
						arr[j] = 0;
					}
				}
			}
		}
		int n = 0;
		for(int i=0; i<arr.length; i++){
		    if(arr[i] != 0){
		        n++;
		    }
		}
        int new_arr[] = new int[n];
        int x =0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0){
            new_arr[x]=arr[i];
            x++;
            }
        }
		for(int i : new_arr) {
			System.out.print(i);
		}

	}
}