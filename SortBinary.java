public class SortBinary {
    public static void main(String s[]){
        int count = 0;
        int num[] = {1,1,0,1,1,0,1,1,0,1};
        for (int i=0; i<num.length; i++){
           if (num[i] == 1){
                count++;
           }
        }
        for (int i=0; i<count; i++){
            num[i] = 1;
        }
        for (int i = count; i<num.length; i++){
            num[i] = 0;
        }
        for(int i:num){
            System.out.print(i); 
        }
        
    }
}
