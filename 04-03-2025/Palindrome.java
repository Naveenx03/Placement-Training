import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = in.next();
        Check obj = new Check(word);
        obj.find();
        obj.find_withBuiltin();
        obj.find_stringBuilder();
        obj.find_stringBuffer();
        in.close();
    }
}

class Check{
    String word;
    Check(String wrd){
        this.word = wrd;
    }

    void find(){
        String word1 = word.toLowerCase();
        boolean result = false;
        String temp="";
        for (int i = word.length()-1; i >= 0; i--) {
            temp += word1.charAt(i);
        }
        for(int i=0; i<=word.length()-1; i++){
            if(temp.charAt(i)!=word1.charAt(i)){
                result = false;
                break;
            }
            else{
                result = true;
            }
        }
        System.out.println(word);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    void find_withBuiltin(){
        String temp="";
        for (int i = word.length()-1; i >= 0; i--) {
            temp += word.charAt(i);
        }
        System.out.println(word);
        if(word.equalsIgnoreCase(temp)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    void find_stringBuilder(){
        StringBuilder word1 = new StringBuilder(word.toString().toLowerCase());
        word1.reverse();
        System.out.println(word);
        if(word1.toString().equals(word.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    void find_stringBuffer(){
        StringBuffer word1 = new StringBuffer(word.toString().toLowerCase());
        word1.reverse();
        System.out.println(word);
        if(word1.toString().equals(word.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}