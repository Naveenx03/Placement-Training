import java.util.Scanner;
class Sub_String{
    void sub_str(String s){
        String sub=s.substring(2,5);
	    System.out.println(sub);
    }
    void sub_strbuild(String s){
        StringBuilder sb=new StringBuilder(s);
	    String sub=sb.substring(2,5);
	    System.out.println(sub);
    }
    void sub_strbuffer(String s){
        StringBuffer sbf=new StringBuffer(s); 
	    String sub=sbf.substring(2,5);
	    System.out.println(sub);
    }
}
class Substring{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s=in.nextLine();
        Sub_String obj=new Sub_String();
        obj.sub_str(s);
        obj.sub_strbuild(s);
        obj.sub_strbuffer(s);
    }
}