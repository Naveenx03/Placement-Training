public class Word_Pattern
{
	public static void main(String[] args) {
        StringBuilder word = new StringBuilder("t6hj7ui");
        int start = 0;
        for(int i=0; i<=word.length()-1; i++){
            char num = word.charAt(i);
            if(Character.isDigit(num)){
                int number = num - '0';
                for(int j=0; j<number; j++){
                    for(int k = start; k<i; k++){
                        System.out.print(word.charAt(k));
                        
                    }
                }
                start = i+1;
            }
            else if(i == word.length()-1){
                for (int k = start; k < word.length(); k++) {
                System.out.print(word.charAt(k));
        }
            }
           
        }
	}
}